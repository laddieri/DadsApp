package com.development.laddieri.dadsapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends Activity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button)findViewById(R.id.dadsButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound();
            }
        });

    }
//Comment!
    private void playSound() {
        //Set random sound
        int[] sounds = {R.raw.sound1, R.raw.sound2, R.raw.sound3,R.raw.sound4,R.raw.sound5,R.raw.sound6,R.raw.sound7,R.raw.sound8,R.raw.sound9,R.raw.sound10,R.raw.sound11,R.raw.sound12,R.raw.sound13,R.raw.sound14};
        Random randomGenerator = new Random();  // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(sounds.length);
        int sound = sounds[randomNumber];


        MediaPlayer player = MediaPlayer.create(this,sound);
       // player.setLooping(true);
        player.start();
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.release();
            }
        });

    }


}
