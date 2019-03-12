package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton); //Button object.

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice); //Left dice image object.
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice); //Right dice image object.

        //Dice array.
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        //Roll Button operations by OnClick listner.
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "Hello Player !"); //For Logcat pane

                Random randomNumberGenerator = new Random(); //Random number method object created.
                int number = randomNumberGenerator.nextInt(6);

                Log.d("Dicee", "The random number is:  " + number); //For Logcat pane

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
