package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LOGINSIGNUP extends AppCompatActivity {
    private Button move1;
    private Button move6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup);
        move1=findViewById(R.id.button);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LOGINSIGNUP.this,LOGIN.class);
                startActivity(intent);
        move6=findViewById(R.id.button2)  ;
        move6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(LOGINSIGNUP.this,SIGNUP.class);
                startActivity(intent1);

            }
        });

            }

        });
    }
}