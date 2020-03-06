package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lp extends AppCompatActivity {

    Button buttpiz,buttgb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp);

        buttpiz = findViewById(R.id.buttpiz);
        buttgb = findViewById(R.id.buttgb);

        buttpiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lp.this , piz.class);
                startActivity(intent);
            }
        });

        buttgb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lp.this , gb.class);
                startActivity(intent);
            }
        });




    }


}
