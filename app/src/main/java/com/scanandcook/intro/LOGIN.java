package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LOGIN extends AppCompatActivity {
    private TextView move2;
    private TextView move1;
    private Button one1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        move2=findViewById(R.id.textView11);
        one1=findViewById(R.id.button3);
        move1=findViewById(R.id.textView7);
        one1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(LOGIN.this,home24.class);
                startActivity(intent1);
            }
        });
        move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LOGIN.this,FORGETPASSWORD.class);
                startActivity(intent);
            }

        });
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(LOGIN.this,SIGNUP.class);
                startActivity(intent3);
            }
        });
    }
}