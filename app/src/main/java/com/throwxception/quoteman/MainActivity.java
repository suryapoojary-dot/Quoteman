package com.throwxception.quoteman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Quote[] quoteof = {

                new Quote("Elon Musk","When something is important enough, you do it even if the odds are not in your favor.",R.drawable.elon ),
                new Quote("Steve Jobs","The people who are crazy enough to think they can change the world are the ones who do.",R.drawable.jobs),
                new Quote("Naval Ravikant","You have one life. You’re dead for tens of billions of years, and you’re going to be dead for tens of billions of years.",R.drawable.naval),
                new Quote("Joseph Nguyen","The less thinking we have, the more space we create for positive emotions to naturally surface.",R.drawable.joseph)


        };


    }
}