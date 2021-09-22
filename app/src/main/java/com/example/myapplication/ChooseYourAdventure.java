package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class ChooseYourAdventure extends AppCompatActivity {

    private ImageButton angerIsland, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        angerIsland = (ImageButton) findViewById(R.id.angerIsland);
        angerIsland.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard1();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLandingPage();
            }
        });
    }

    public void openStoryBoard1() {
        Intent intent = new Intent(this, StoryBoard1.class);
        startActivity(intent);
    }

    public void openLandingPage() {
        Intent intent = new Intent(this, LandingPage.class);
        startActivity(intent);
    }
}


