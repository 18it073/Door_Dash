package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Service extends AppCompatActivity {

    Button buttre,buttgrocery,buttmedicine,buttsendpack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        buttre = findViewById(R.id.buttrest);
        buttgrocery = findViewById(R.id.buttgroc);
        buttmedicine = findViewById(R.id.buttmed);
        buttsendpack = findViewById(R.id.buttsend);


        buttre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Service.this , Restaurant.class);
                startActivity(intent);
            }
        });

        buttgrocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Service.this , Grocery.class);
                startActivity(intent);
            }
        });

        buttmedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Service.this , Medicine.class);
                startActivity(intent);
            }
        });

        buttsendpack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Service.this , sp.class);
                startActivity(intent);
            }
        });

    }
}
