package com.scanandcook.intro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class adminpanel extends AppCompatActivity {
    private TextView t1;
    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpanel);
        t1=findViewById(R.id.textView4);
        i1=findViewById(R.id.imageView11);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(adminpanel.this,LOGIN.class);
                startActivity(intent);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(adminpanel.this,LOGIN.class);
                startActivity(intent1);
            }
        });
    }
}