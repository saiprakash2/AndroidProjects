package com.sai.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1;
    private Random myRandomNumbers = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.imageView);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rollDice();
                mp.start();

//                displayToast();
            }

        });
    }

    public void rollDice(){
        int myRanNum = myRandomNumbers.nextInt(6) +1;
        switch (myRanNum){
            case 1 :imageView1.setImageResource(R.drawable.dice1);
                break;
            case 2 :imageView1.setImageResource(R.drawable.dice2);
                break;
            case 3 :imageView1.setImageResource(R.drawable.dice3);
                break;
            case 4 :imageView1.setImageResource(R.drawable.dice4);
                break;
            case 5 :imageView1.setImageResource(R.drawable.dice5);
                break;
            case 6 :imageView1.setImageResource(R.drawable.dice6);
                break;
        }

    }
//    private void displayToast() {
//
//        Toast.makeText(getApplicationContext(),myRanNum,Toast.LENGTH_SHORT).show();
//    }

}
