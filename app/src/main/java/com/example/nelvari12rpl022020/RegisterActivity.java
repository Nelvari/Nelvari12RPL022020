package com.example.nelvari12rpl022020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    EditText txtNama, txtEmail, txtPassword, txtNoktp, txtNohp, txtAlamat;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtNama = findViewById(R.id.txtNama);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        txtNoktp = findViewById(R.id.txtNoktp);
        txtNohp = findViewById(R.id.txtNohp);
        txtAlamat = findViewById(R.id.txtAlamat);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

    }
}