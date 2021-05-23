package com.example.kbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button button1;
    ImageView imgview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btn1);
        imgview1 = (ImageView) findViewById(R.id.iv1);
        MediaPlayer mp1;
        mp1 = MediaPlayer.create(this,R.raw.kbc_theme1);
        if(mp1.isPlaying()){
            mp1.stop();
        }
        mp1.start();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp1.isPlaying()){
                    mp1.stop();
                    mp1.release();
                }
                Intent startgame = new Intent(getApplicationContext(),Start_Game.class);
                startActivity(startgame);
                finish();
            }
        });
    }


}