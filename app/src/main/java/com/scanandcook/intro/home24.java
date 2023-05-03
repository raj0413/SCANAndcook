package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class home24 extends AppCompatActivity {
    private ImageView i1;
    private ImageView i2;
    private ImageView i3;
    private ImageView i4;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home24);
        i1=findViewById(R.id.imageView16);
        i2=findViewById(R.id.imageView17);
        i3=findViewById(R.id.imageView19);
        i4=findViewById(R.id.imageView18);
        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home24.this,adminpanel.class);
                startActivity(intent);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1=new Intent(home24.this,SEARCH.class);
                startActivity(intent1);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2=new Intent(home24.this,SETTING.class);
                startActivity(intent2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent3=new Intent(home24.this,SEARCH.class);
                startActivity(intent3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent4=new Intent(home24.this,history.class);
                startActivity(intent4);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(home24.this,suppport.class);
                startActivity(intent5);
            }
        });
    }
}