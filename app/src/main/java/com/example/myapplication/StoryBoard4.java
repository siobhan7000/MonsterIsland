package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class StoryBoard4 extends AppCompatActivity {

    private ImageButton waitButton, backButton, achievementsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb4);

        waitButton = (ImageButton) findViewById(R.id.waitButton);
        waitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard5();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard3();
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


    public void openStoryBoard3() {
        Intent intent = new Intent(this, StoryBoard3.class);
        startActivity(intent);
    }

    public void openStoryBoard5() {
        Intent intent = new Intent(this, StoryBoard5.class);
        startActivity(intent);
    }

    public void openAchievements() {
        Intent intent = new Intent(this, Achievements.class);
        startActivity(intent);
    }
}