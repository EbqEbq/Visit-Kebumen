package com.example.visitkebumen;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.view.View;

public class TentangKami extends AppCompatActivity {

    ImageView insta, twitt, face, yout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);

        insta= findViewById(R.id.instagram);
        twitt= findViewById(R.id.twitter);
        face= findViewById(R.id.facebook);
        yout= findViewById(R.id.youtube);

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/visitkebumen");
            }
        });

        twitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.twitter.com/visitkebumen");
            }
        });

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/visitkebumen.official");
            }
        });

        yout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/c/VisitKebumen");
            }
        });




    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}