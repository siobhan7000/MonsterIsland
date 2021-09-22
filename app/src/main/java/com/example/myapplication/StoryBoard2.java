package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class StoryBoard2 extends AppCompatActivity {

    private ImageButton superSpeedButton, backButton, achievementsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb2);

        superSpeedButton = (ImageButton) findViewById(R.id.superSpeed);
        superSpeedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCorrect();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard1();
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


    public void openStoryBoard1() {
        Intent intent = new Intent(this, StoryBoard1.class);
        startActivity(intent);
    }

    public void openCorrect() {
        Intent intent = new Intent(this, Correct.class);
        startActivity(intent);
    }

    public void openAchievements() {
        Intent intent = new Intent(this, Achievements.class);
        startActivity(intent);
    }
}