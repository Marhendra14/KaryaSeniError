package com.example.karyaseni;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText etEmail;
    Button btnResetPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        getSupportActionBar().hide();

        init();

        btnResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etEmail.getText().toString();
                mAuth.sendPasswordResetEmail(email);
                Toast.makeText(getApplicationContext(), "Recovery Email has been  sent to " + email ,
                        Toast.LENGTH_LONG).show();
                etEmail.setText("");
            }
        });

    }

    private void init(){
        mAuth = FirebaseAuth.getInstance();
        etEmail = findViewById(R.id.etEmail);
        btnResetPassword = findViewById(R.id.btnResetPassword);
    }
}
