package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;

public class Correct extends AppCompatActivity {

    private ImageButton backButton;
    private ImageButton nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct1);

        nextButton = (ImageButton) findViewById(R.id.arrow);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard3();
            }
        });

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStoryBoard2();
            }
        });



    }


    public void openStoryBoard2() {
        Intent intent = new Intent(this, StoryBoard2.class);
        startActivity(intent);
    }

    public void openStoryBoard3() {
        Intent intent = new Intent(this, StoryBoard3.class);
        startActivity(intent);
    }
}