package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class a extends AppCompatActivity {

    Button buttflour,buttdetergent,butthandwash,butthairoil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        buttflour = findViewById(R.id.buttflour);
        buttdetergent = findViewById(R.id.buttdetergent);
        butthandwash = findViewById(R.id.butthandwash);
        butthairoil = findViewById(R.id.butthairoil);


        buttflour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a.this , flour.class);
                startActivity(intent);
            }
        });

        buttdetergent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a.this , detergent.class);
                startActivity(intent);
            }
        });

        butthandwash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a.this ,handwash.class);
                startActivity(intent);
            }
        });

        butthairoil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(a.this , hairoil.class);
                startActivity(intent);
            }
        });

    }


}

