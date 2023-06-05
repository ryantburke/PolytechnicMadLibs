package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibsJoesDisplayActivity extends AppCompatActivity {
private TextView tvStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_joes_display);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory.setText(story);



    }
}