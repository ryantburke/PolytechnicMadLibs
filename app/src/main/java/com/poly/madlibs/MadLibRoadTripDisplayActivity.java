package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibRoadTripDisplayActivity extends AppCompatActivity {

    private TextView tvStory;
    private ImageView ivPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_roadtrip_display);

        tvStory = findViewById(R.id.tv_story);
        ivPicture = findViewById(R.id.iv_picture);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        ivPicture.setImageResource(R.drawable.roadtrip_image);
        tvStory.setText(story);
    }
}