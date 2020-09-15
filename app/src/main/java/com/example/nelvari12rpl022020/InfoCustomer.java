package com.example.nelvari12rpl022020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoCustomer extends AppCompatActivity {

    TextView tvId, tvNama, tvEmail, tvNohp, tvAlamat, tvNoktp;
    ImageView ivProfile, ivEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_customer);

        tvId = findViewById(R.id.tvId);
        tvNama = findViewById(R.id.tvNama);
        tvEmail = findViewById(R.id.tvEmail);
        tvNohp = findViewById(R.id.tvNohp);
        tvAlamat = findViewById(R.id.tvAlamat);
        tvNoktp = findViewById(R.id.tvNoktp);
        ivProfile = findViewById(R.id.ivProfile);
        ivEdit = findViewById(R.id.ivEdit);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Info Customer");

        Bundle extras = getIntent().getExtras();
        final String id = extras.getString("id");
        final String nama = extras.getString("nama");
        final String email = extras.getString("email");
        final String nohp = extras.getString("nohp");
        final String alamat = extras.getString("alamat");
        final String noktp = extras.getString("noktp");

        tvId.setText("Id        : " + id);
        tvNama.setText("Nama      : " + nama);
        tvEmail.setText("Email     : " + email);
        tvNohp.setText("No Hp     : " + nohp);
        tvAlamat.setText("Alamat    : " + alamat);
        tvNoktp.setText("No KTP    : " + noktp);

        ivEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(InfoCustomer.this, EditCustomer.class);
                in.putExtra("id", id);
                in.putExtra("nama", nama);
                in.putExtra("email", email);
                in.putExtra("nohp", nohp);
                in.putExtra("alamat", alamat);
                in.putExtra("noktp", noktp);
                startActivityForResult(in, 23);
            }
        });

    }
}