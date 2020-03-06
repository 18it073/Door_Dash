package com.example.zozo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
  EditText mtextemail , mtextpassword;
   Button mbuttonlogin;
   TextView mtextviewRegister;
   FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = FirebaseAuth.getInstance();


        mtextemail= findViewById(R.id.etEmailL);
        mtextpassword = findViewById(R.id.etPassL);
        mbuttonlogin = findViewById(R.id.btnlogin);
        mtextviewRegister = findViewById(R.id.tvReg);


        mtextviewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this ,RegisterActivity.class);
                startActivity(intent);


            }
        });

        mbuttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = mtextemail.getText().toString();
                String pass = mtextpassword.getText().toString();

                firebaseAuth.signInWithEmailAndPassword(email, pass)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                   startActivity(new Intent(MainActivity.this,Service.class));
                                   finish();
                                } else {
                                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            }
        });
    }
}
