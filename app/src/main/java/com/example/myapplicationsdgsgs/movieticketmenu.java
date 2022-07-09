package com.example.myapplicationsdgsgs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class movieticketmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movieticketmenu);
        ImageButton b8=(ImageButton) findViewById(R.id.imageButton5);
        ImageButton b9=(ImageButton) findViewById(R.id.imageButton6);
        ImageButton b10=(ImageButton) findViewById(R.id.imageButton7);
        ImageButton b11=(ImageButton) findViewById(R.id.imageButton8);
        ImageButton b12=(ImageButton) findViewById(R.id.imageButton9);
        ImageButton b13=(ImageButton) findViewById(R.id.imageButton10);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,kgf2.class);
                startActivity(intent);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,charlie.class);
                startActivity(intent);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,vikram.class);
                startActivity(intent);
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,mahaan.class);
                startActivity(intent);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,spidey.class);
                startActivity(intent);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(movieticketmenu.this,bhool.class);
                startActivity(intent);
            }
        });

    }
}