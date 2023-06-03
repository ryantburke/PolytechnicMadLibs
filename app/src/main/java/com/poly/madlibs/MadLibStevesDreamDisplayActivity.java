package com.poly.madlibs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibStevesDreamDisplayActivity extends AppCompatActivity {

private TextView myStory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_stevesdream_display);
        myStory = findViewById(R.id.et_myStory);

        String story = getIntent().getStringExtra("story");
        myStory.setText(story);


    }
}