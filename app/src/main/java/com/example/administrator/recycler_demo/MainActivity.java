package com.example.administrator.recycler_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rv=new RecyclerView(this);
        setContentView(rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter() {
            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView tv;
                public ViewHolder(TextView itemView){
                    super(itemView);
                    tv=itemView;
                }

                public TextView getTv() {
                     return tv;
                }
            }
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
                 ViewHolder vh=(ViewHolder)holder;
                vh.getTv().setText(data[i]);
            }

            @Override
            public int getItemCount() {
                return data.length;
            }
            private String[]data=new String[]{"JAVA"," "," "," ","数据类型和运算符"," ","流程控制和数组"," ","类和对象"," ","封装"," ","继承"," ","多态"," ","接口"," ","内部类"," ","集合"," ","泛型"," ","IO流"," ","线程",
            " "," "," ","Android"," "," "," ","活动"," ","控件"," ","布局"," ","ListView"," ","RecylerView"," ","Frangement"," ","数据库"," "," "," "};
        });
    }
}
