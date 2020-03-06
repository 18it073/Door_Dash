package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grocery extends AppCompatActivity {

    Button buttd,buttr,butta,butts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        buttd = findViewById(R.id.buttd);
        buttr = findViewById(R.id.buttr);
        butta = findViewById(R.id.butta);
        butts = findViewById(R.id.butts);


        buttd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grocery.this , d.class);
                startActivity(intent);
            }
        });

        buttr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grocery.this , rl.class);
                startActivity(intent);
            }
        });

        butta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grocery.this ,a.class);
                startActivity(intent);
            }
        });

        butts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Grocery.this , s.class);
                startActivity(intent);
            }
        });

    }
}

