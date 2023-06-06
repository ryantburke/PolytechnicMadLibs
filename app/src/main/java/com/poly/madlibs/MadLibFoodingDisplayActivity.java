package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MadLibFoodingDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooding_display);

        TextView tvStory= findViewById(R.id.tv_story);
        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory.setText(story);
    }
}