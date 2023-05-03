package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SCANANDCOOK extends AppCompatActivity {
    private Button move;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanandcook);
        move=findViewById(R.id.button124);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SCANANDCOOK.this,LOGINSIGNUP.class);
                startActivity(intent);
            }
        });


    }



}