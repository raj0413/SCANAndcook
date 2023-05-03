package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Security extends AppCompatActivity {
    private TextView b1;
    private TextView b2;
    private TextView b3;
    private TextView b4;
    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        b1=findViewById(R.id.textView21);
        b2=findViewById(R.id.textView22);
        b3=findViewById(R.id.textView23);
        b4=findViewById(R.id.textView25);
        i1=findViewById(R.id.imageView20);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Security.this,ChangePassword.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Security.this,adminpanel.class);
                startActivity(intent1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Security.this,yourdevices.class);
                startActivity(intent2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Security.this,LOGIN.class);
                startActivity(intent3);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(Security.this,LOGIN.class);
                startActivity(intent4);
            }
        });
        
    }
}