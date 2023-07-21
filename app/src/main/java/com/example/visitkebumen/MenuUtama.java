package com.example.visitkebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {



    Button button1, button2, button3, button4, button5, button6, button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        //wisata alam
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, WisataAlam.class);
                finish();
                startActivity(intent);
            }
        });

        //wisata edukasi
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, WisataEdukasi.class);
                finish();
                startActivity(intent);
            }
        });

        //wisata religi
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, WisataReligi.class);
                finish();
                startActivity(intent);
            }
        });

        //wisata kuliner
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, WisataKuliner.class);
                finish();
                startActivity(intent);
            }
        });

        //tentang kami
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, TentangKami.class);
                finish();
                startActivity(intent);
            }
        });

        //oleh-oleh
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, oleholeh.class);
                finish();
                startActivity(intent);
            }
        });

//        //keluar
//        button6 = (Button) findViewById(R.id.button6);
//        button6.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                moveTaskToBack(true);
//
//                //membuat method tombol keluar dari aplikasi
//            }
//        });

        //paket wisata
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuUtama.this, PaketWisata.class);
                finish();
                startActivity(intent);
            }
        });



    }
}