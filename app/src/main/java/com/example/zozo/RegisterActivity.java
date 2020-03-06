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

public class RegisterActivity extends AppCompatActivity {

    EditText newEmail , newpassword ,cnfpassword ;
    Button buttonregister;
    TextView viewlogin;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    newEmail = findViewById(R.id.etEmail);
    newpassword = findViewById(R.id.etPass);
    cnfpassword = findViewById(R.id.etcnfpass);
    buttonregister = findViewById(R.id.btnReg);
    viewlogin = findViewById(R.id.tvlogin);
    firebaseAuth = FirebaseAuth.getInstance();

viewlogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Intent intent =new Intent(RegisterActivity.this , MainActivity.class);
        startActivity(intent);
    }
});

buttonregister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String email = newEmail.getText().toString().trim();
        String pass = newpassword.getText().toString().trim();

        firebaseAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(RegisterActivity.this,Service.class));
                            finish();
                        } else {
                            String e= task.getException().getMessage();
                            Toast.makeText(RegisterActivity.this, e, Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }
});

    }
}
