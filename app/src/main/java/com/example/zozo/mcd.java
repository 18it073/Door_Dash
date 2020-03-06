package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mcd extends AppCompatActivity {

    Button buttburger,buttwrap,buttb,buttcombo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcd);

        buttburger = findViewById(R.id.buttburger);
        buttwrap = findViewById(R.id.buttwrap);
        buttb = findViewById(R.id.buttb);
        buttcombo = findViewById(R.id.buttcombo);


        buttburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcd.this , burger.class);
                startActivity(intent);
            }
        });

        buttwrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcd.this , wrap.class);
                startActivity(intent);
            }
        });

        buttb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcd.this ,b.class);
                startActivity(intent);
            }
        });

        buttcombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcd.this , combo.class);
                startActivity(intent);
            }
        });

    }


}

