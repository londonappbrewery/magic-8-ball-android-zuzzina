package com.londonappbrewery.magiceightball;

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

//      HERE MY CODE STARTS:
//      variable definitions:
//      layout objects:
        Button button_ask = (Button) findViewById(R.id.Button_ask);
        final ImageView image_ball = (ImageView) findViewById(R.id.Image_ball);

//      array with ball images:
        final int[] ballImageArray = {R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5};


        button_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Ball", "The button has been pressed");

                Random RandomNumberGenerator = new Random();
//              the random object generates a random integer (via its method nextInt) and stores it in a new int variable:
                int chosen_index = RandomNumberGenerator.nextInt(5);

                image_ball.setImageResource(ballImageArray[chosen_index]);

            }
        });

    }




}
