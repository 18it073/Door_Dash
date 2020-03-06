package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class d extends AppCompatActivity {

    Button buttbis,buttpulse,buttshampoo,buttcolddrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        buttbis = findViewById(R.id.buttbis);
        buttpulse = findViewById(R.id.buttpulse);
        buttshampoo = findViewById(R.id.buttshampoo);
        buttcolddrink = findViewById(R.id.buttcolddrink);


        buttbis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(d.this , bis.class);
                startActivity(intent);
            }
        });

        buttpulse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(d.this , pulse.class);
                startActivity(intent);
            }
        });

        buttshampoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(d.this ,shampoo.class);
                startActivity(intent);
            }
        });

        buttcolddrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(d.this , colddrink.class);
                startActivity(intent);
            }
        });

    }


}

