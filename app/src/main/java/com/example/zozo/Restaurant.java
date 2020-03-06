package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Restaurant extends AppCompatActivity {

    Button buttmcd,buttdom,buttmm,buttlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        buttmcd = findViewById(R.id.buttmcd);
        buttdom = findViewById(R.id.buttdom);
        buttmm = findViewById(R.id.buttmm);
        buttlp = findViewById(R.id.buttlp);


        buttmcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , mcd.class);
                startActivity(intent);
            }
        });

        buttdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , dom.class);
                startActivity(intent);
            }
        });

        buttmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this ,mm.class);
                startActivity(intent);
            }
        });

        buttlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , lp.class);
                startActivity(intent);
            }
        });

    }
}

