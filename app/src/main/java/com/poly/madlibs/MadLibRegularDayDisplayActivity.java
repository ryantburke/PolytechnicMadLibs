package com.poly.madlibs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibRegularDayDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_regularday_display);


        String story = getIntent().getStringExtra("story");

        TextView tvStory = findViewById(R.id.tv_story);

        tvStory.setText(story);


    }
}