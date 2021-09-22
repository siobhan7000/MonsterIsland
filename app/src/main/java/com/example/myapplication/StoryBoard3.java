package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class StoryBoard3 extends AppCompatActivity {

    private ImageButton backButton;
    private ImageButton achievementsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sbb3);

        ImageButton stressBall = (ImageButton) findViewById(R.id.stressBall);
        stressBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard4();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCorrect();
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


    public void openStoryBoard4() {
        Intent intent = new Intent(this, StoryBoard4.class);
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