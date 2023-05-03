package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SETTING extends AppCompatActivity {
    private TextView T1;
    private TextView T2;
    private TextView T3;
    private TextView T4;
    private TextView T5;
    private TextView T6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        T1=findViewById(R.id.download);
        T2=findViewById(R.id.changepassword);
        T3=findViewById(R.id.Security);
        T4=findViewById(R.id.notification);
        T5=findViewById(R.id.History);
        T6=findViewById(R.id.help_support);

        T1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SETTING.this,DownloadPanel.class);
                startActivity(intent);
            }
        });
        T2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(SETTING.this,ChangePassword.class);
                startActivity(intent1);
            }
        });
        T3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(SETTING.this,Security.class);
                startActivity(intent2);
            }
        });
        T4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(SETTING.this,notifications.class);
                startActivity(intent4);
            }
        });
        T5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(SETTING.this,history.class);
                startActivity(intent5);
            }
        });
        T6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6=new Intent(SETTING.this,suppport.class);
                startActivity(intent6);
            }
        });
    }
}