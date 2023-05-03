package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Createpassword extends AppCompatActivity {
    private Button move1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createpassword);
        move1=findViewById(R.id.button);
        move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Createpassword.this,LOGIN.class);
                startActivity(intent);
            }
        });

    }
}