package com.example.zozo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zozo.R;
import com.example.zozo.mcd;

import java.util.HashMap;

public class coke extends AppCompatActivity {
    static HashMap<String,Integer> selection = new HashMap<>();
    static HashMap<String,Integer> price = new HashMap<>();
    CheckBox a, b, c, d, e, f, g, h;
    int counter9 = 0,counter10=0,counter12=0,counter13=0,counter14=0,counter15=0,counter16=0,counter11=0;
    TextView textView,size10,size11,size12,size13,size14,size15,size16,size9;
    Button button,cart5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coke);
        a = findViewById(R.id.C1);
        b = findViewById(R.id.C2);
        c = findViewById(R.id.C3);
        d = findViewById(R.id.C4);


        size9 = findViewById(R.id.size9);
        size10 = findViewById(R.id.size10);
        size11 = findViewById(R.id.size11);
        size12= findViewById(R.id.size12);
        button = findViewById(R.id.add);
        cart5 = findViewById(R.id.cart5);


        StringBuilder s = new StringBuilder() ;
        price.put(a.getText().toString(),79);
        price.put(b.getText().toString(),76);
        price.put(c.getText().toString(),76);
        price.put(d.getText().toString(),48);
        for(String str : selection.keySet())
        {
            if(a.getText().equals(str)){
                a.setChecked(true);
            }
            if(b.getText().equals(str)){
                b.setChecked(true);
            }
            if(c.getText().equals(str)){
                c.setChecked(true);
            }
            if(d.getText().equals(str)){
                d.setChecked(true);
            }
            if(e.getText().equals(str)){
                e.setChecked(true);
            }
            if(f.getText().equals(str)){
                f.setChecked(true);
            }
            if(g.getText().equals(str)){
                g.setChecked(true);
            }
            if(h.getText().equals(str)){
                h.setChecked(true);
            }
            s.append(str).append(": ").append(selection.get(str)).append("\n");
        }
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.isChecked()) {
                    if(counter9 == 0)
                    {
                        counter9 = 1;
                    }
                    size9.setText(Integer.toString(counter9));
                    selection.put(a.getText().toString(),counter9);
                } else {
                    size9.setText("");
                    selection.remove(a.getText().toString());
                    counter9=0;
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b.isChecked()) {
                    if(counter10 == 0)
                    {
                        counter10 = 1;
                    }
                    size10.setText(Integer.toString(counter10));
                    selection.put(b.getText().toString(),counter10);
                } else {
                    size10.setText("");
                    selection.remove(b.getText().toString());
                    counter10=0;
                }
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c.isChecked()) {
                    if(counter11 == 0)
                    {
                        counter11 = 1;
                    }
                    size11.setText(Integer.toString(counter11));
                    selection.put( c.getText().toString(),counter11);
                } else {
                    size11.setText("");
                    selection.remove(c.getText().toString());
                    counter11=0;
                }
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (d.isChecked()) {
                    if(counter12 == 0)
                    {
                        counter12 = 1;
                    }
                    size12.setText(Integer.toString(counter12));
                    selection.put(d.getText().toString(),counter12);
                } else {
                    size12.setText("");
                    selection.remove(d.getText().toString());
                    counter12=0;
                }
            }
        });





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                for(String s:selection.keySet()) {
                    sb.append(s).append(" : ").append(selection.get(s)).append("\n");
                }

                textView.setText(sb.toString());
                textView.setEnabled(true);
            }
        });
        cart5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(coke.this,f1.class);
                startActivity(intent);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countDE12(View view) {
        if(d.isChecked()) {
            if(counter12==1)
            {
                counter12=0;
                d.setChecked(false);
                size12.setText("");
            }
            else
            {
                counter12--;
            }
            size12.setText(Integer.toString(counter12));
            selection.replace(d.getText().toString(), counter12);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size12.setText("");
        }}
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countIN12(View view) {
        if(d.isChecked()) {
            counter12++;
            size12.setText(Integer.toString(counter12));
            selection.replace(d.getText().toString(), counter12);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size12.setText("");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countDE11(View view) {
        if(c.isChecked()) {
            if(counter11==1)
            {
                counter11=0;
                c.setChecked(false);
                size11.setText("");
            }
            else
            {
                counter11--;
            }
            size11.setText(Integer.toString(counter11));
            selection.replace(c.getText().toString(), counter11);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size11.setText("");
        }}
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countIN11(View view) {
        if(c.isChecked()) {
            counter11++;
            size11.setText(Integer.toString(counter11));
            selection.replace(c.getText().toString(), counter11);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size11.setText("");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countDE10(View view) {
        if(b.isChecked()) {
            if(counter10==1)
            {
                counter10=0;
                b.setChecked(false);
                size10.setText("");
            }
            else
            {
                counter10--;
            }
            size10.setText(Integer.toString(counter10));
            selection.replace(b.getText().toString(), counter10);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size10.setText("");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countIN10(View view) {
        if(b.isChecked()) {
            counter10++;
            size10.setText(Integer.toString(counter10));
            selection.replace(b.getText().toString(), counter10);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size10.setText("");
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countDE9(View view) {
        if(a.isChecked()) {
            if(counter9==1)
            {
                counter9=0;
                a.setChecked(false);
            }
            else
            {
                counter9--;
            }
            size9.setText(Integer.toString(counter9));
            selection.replace(a.getText().toString(), counter9);
        }
        else{
            size9.setText("");
        }}
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void countIN9(View view) {
        if(a.isChecked()) {
            counter9++;
            size9.setText(Integer.toString(counter9));
            selection.replace(a.getText().toString(), counter9);
        }
        else{
            Toast.makeText(coke.this, "Please Select That Item First", Toast.LENGTH_SHORT).show();
            size9.setText("");
        }
    }


}

