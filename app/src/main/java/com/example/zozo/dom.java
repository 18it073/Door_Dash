package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dom extends AppCompatActivity {

    Button buttpizza,buttcoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom);

        buttpizza = findViewById(R.id.buttpizza);
        buttcoke = findViewById(R.id.buttcoke);



        buttpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dom.this , pizza.class);
                startActivity(intent);
            }
        });

        buttcoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dom.this , coke.class);
                startActivity(intent);
            }
        });


    }


}

