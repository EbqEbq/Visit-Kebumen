package com.example.visitkebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PaketWisata extends AppCompatActivity {

    TextView paketsatu, paketdua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_wisata);

        paketsatu= findViewById(R.id.paketsatu);

        paketsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://api.whatsapp.com/send?phone=89603780936");

            }

        });

        paketdua= findViewById(R.id.paketdua);

        paketdua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://api.whatsapp.com/send?phone=89603780936");

            }

        });



    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}