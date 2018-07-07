package com.example.kathykanemoto.anndroidinalgorithmland_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for the character gif
        GifView pGif = (GifView) findViewById(R.id.viewGif);
        pGif.setImageResource(R.drawable.anndroid);
    }
}
