package com.example.zozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rl extends AppCompatActivity {

    Button buttfruit,buttveg,buttsoap,buttdairy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rl);

        buttfruit = findViewById(R.id.buttfruit);
        buttveg = findViewById(R.id.buttveg);
        buttsoap = findViewById(R.id.buttsoap);
        buttdairy = findViewById(R.id.buttdairy);


        buttfruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rl.this , fruit.class);
                startActivity(intent);
            }
        });

        buttveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rl.this , veg.class);
                startActivity(intent);
            }
        });

        buttsoap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rl.this ,soap.class);
                startActivity(intent);
            }
        });

        buttdairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rl.this , dairy.class);
                startActivity(intent);
            }
        });

    }


}
