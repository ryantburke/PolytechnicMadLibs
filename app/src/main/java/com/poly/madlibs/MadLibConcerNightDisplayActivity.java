package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibConcerNightDisplayActivity extends AppCompatActivity {

    private TextView tvStory;
    private ImageView ivMain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_concertnight_display);

        ivMain = findViewById(R.id.iv_main);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory = findViewById(R.id.tv_story);
        tvStory.setText(story);

        ivMain.setImageResource(R.drawable.concertnight_image2);
    }
}