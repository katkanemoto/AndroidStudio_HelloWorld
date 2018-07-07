package com.example.kathykanemoto.anndroidinalgorithmland_v2;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting the orientation to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //for the character gif
        GifView pGif = (GifView) findViewById(R.id.viewGif);
        pGif.setImageResource(R.drawable.anndroid);

        //to play the theme song
        MediaPlayer themeSong = MediaPlayer.create(getApplicationContext(), R.raw.themesong);
        themeSong.start();
    }
}
