package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class StoryBoard1 extends AppCompatActivity {

    private ImageButton backButton;
    private ImageButton achievementsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sb1);

        ImageButton leftButton = (ImageButton) findViewById(R.id.leftButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard2();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChooseYourAdventure();
            }
        });

//        achievementsButton = (ImageButton) findViewById(R.id.achievements);
//        achievementsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openAchievements();
//            }
//        });


    }


    public void openStoryBoard2() {
        Intent intent = new Intent(this, StoryBoard2.class);
        startActivity(intent);
    }


    public void openChooseYourAdventure() {
        Intent intent = new Intent(this, ChooseYourAdventure.class);
        startActivity(intent);
    }

    public void openAchievements() {
        Intent intent = new Intent(this, Achievements.class);
        startActivity(intent);
    }
}