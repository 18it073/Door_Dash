package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Medicine extends AppCompatActivity {

    Button buttn,buttm1,buttm2,buttm3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        buttn = findViewById(R.id.buttn);
        buttm1 = findViewById(R.id.buttm1);
        buttm2 = findViewById(R.id.buttm2);
        buttm3 = findViewById(R.id.buttm3);


        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Medicine.this , n.class);
                startActivity(intent);
            }
        });

        buttm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Medicine.this , m1.class);
                startActivity(intent);
            }
        });

        buttm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Medicine.this ,m2.class);
                startActivity(intent);
            }
        });

        buttm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Medicine.this , m3.class);
                startActivity(intent);
            }
        });

    }
}

