package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FORGETPASSWORD extends AppCompatActivity {
    private Button move342;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);
        move342=findViewById(R.id.button3);
        move342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(FORGETPASSWORD.this,Createpassword.class);
                startActivity(intent);
            }
        });

    }
}