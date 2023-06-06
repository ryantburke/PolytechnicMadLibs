package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibBirthdayPartyDisplayActivity extends AppCompatActivity {

    TextView tvTopText;
    TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_birthdayparty_display);


        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory = findViewById(R.id.tv_story);

        tvStory.setText(story);


    }
}