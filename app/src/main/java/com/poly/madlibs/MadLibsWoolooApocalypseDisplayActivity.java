package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MadLibsWoolooApocalypseDisplayActivity extends AppCompatActivity {

    private ImageView ivMain;
    private TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evan_activity_woolooapocalypse);

        ivMain = findViewById(R.id.iv_main);
        tvStory = findViewById(R.id.story_apocalypse);
        String story = getIntent().getStringExtra("story");
        Log.i("story display",story);
        ivMain.setImageResource(getIntent().getIntExtra("image",0));
        tvStory.setText(story);
    }
}