package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mm extends AppCompatActivity {

    Button buttpun,buttnaan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mm);

        buttpun = findViewById(R.id.buttpun);
        buttnaan = findViewById(R.id.buttnaan);

        buttpun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mm.this , pun.class);
                startActivity(intent);
            }
        });

        buttnaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mm.this , naan.class);
                startActivity(intent);
            }
        });



    }


}

