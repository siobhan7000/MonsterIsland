package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class StoryBoard5 extends AppCompatActivity {

    private ImageButton throwButton, encourageButton, achievementsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb5);

        encourageButton = (ImageButton) findViewById(R.id.encourageButton);
        encourageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCorrect2();
            }
        });

        throwButton = (ImageButton) findViewById(R.id.throwButton);
        throwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTryAgain();
            }
        });



        achievementsButton = (ImageButton) findViewById(R.id.achievements);
        achievementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAchievements();
            }
        });


    }


    public void openTryAgain() {
        Intent intent = new Intent(this, TryAgain.class);
        startActivity(intent);
    }

    public void openCorrect2() {
        Intent intent = new Intent(this, Correct2.class);
        startActivity(intent);
    }

    public void openAchievements() {
        Intent intent = new Intent(this, Achievements.class);
        startActivity(intent);
    }
}