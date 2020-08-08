package com.example.nelvari12rpl022020;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.txtUsername);
        etPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();

                if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
                    Toast.makeText(MainActivity.this, "Hai Admin!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                    startActivity(intent);
                }else if(username.equalsIgnoreCase("nelvari") && password.equalsIgnoreCase("nelvari")){
                    Toast.makeText(MainActivity.this, "Hai Nelvari!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, CostumerActivity.class);
                    startActivity(intent);
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Admin : \n username = admin, password = admin \n \n Costumer : \n username = nelvari, password = nelvari")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    builder.show();
                }

            }
        });

    }
}