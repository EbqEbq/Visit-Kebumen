package com.example.visitkebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class WisataKuliner extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        //Benteng Van Der Wijck
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WisataKuliner.this, SateAmbalPakKasman.class);
                finish();
                startActivity(intent);
            }
        });

        //Mangrove
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WisataKuliner.this, NasiPenggelPakSuratman.class);
                finish();
                startActivity(intent);
            }
        });

        //Garam
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WisataKuliner.this, SotoAyamPetanahanPakKored.class);
                finish();
                startActivity(intent);
            }
        });

    }
}