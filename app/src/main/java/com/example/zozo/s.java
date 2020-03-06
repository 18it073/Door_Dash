package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class s extends AppCompatActivity {

    Button buttgrain,butttea,butttoothpaste,buttoil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s);

        buttgrain = findViewById(R.id.buttgrain);
        butttea = findViewById(R.id.butttea);
        butttoothpaste = findViewById(R.id.butttoothpaste);
        buttoil = findViewById(R.id.buttoil);


        buttgrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s.this , grain.class);
                startActivity(intent);
            }
        });

        butttea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s.this , tea.class);
                startActivity(intent);
            }
        });

        butttoothpaste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s.this ,toothpaste.class);
                startActivity(intent);
            }
        });

        buttoil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s.this , oil.class);
                startActivity(intent);
            }
        });

    }


}

