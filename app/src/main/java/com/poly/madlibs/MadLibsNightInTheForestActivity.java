package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MadLibsNightInTheForestActivity extends AppCompatActivity {
    EditText etTime;
    EditText etNoun;
    EditText etAdjective;
    EditText etColor;
    EditText etFruit;
    EditText etMusicArtist;
    EditText etVerb;
    EditText etCelebrity;
    EditText etSong;
    EditText etTvShow;

    Button btnNextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_nightintheforest);

        etTime = findViewById(R.id.et_time);
        etNoun = findViewById(R.id.et_noun);
        etAdjective = findViewById(R.id.et_adjective);
        etColor = findViewById(R.id.et_Color);
        etFruit = findViewById(R.id.et_fruit);
        etMusicArtist = findViewById(R.id.et_musicArtist);
        etVerb = findViewById(R.id.et_verb);
        etCelebrity = findViewById(R.id.et_celebrity);
        etSong = findViewById(R.id.et_song);
        etTvShow = findViewById(R.id.et_tvShow);
        btnNextPage = findViewById(R.id.btn_generatestory);

        Intent secondActivity = new Intent(MadLibsNightInTheForestActivity.this, MadLibsNightInTheForestDisplayActivity.class);
        String sendThisString = "Whatever string I want to send";
        String sendThisTo = "The other string I want to send";
        secondActivity.putExtra("data1",sendThisString);
        secondActivity.putExtra("data2",sendThisTo);
        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "The Night In The Forest!";
                story += "\n It was a " + etAdjective.getText() +" night all by yourself. ";
                story += "\n It was around "+ etTime.getText() +" at night";
                story += "\n In the distance you hear " + etMusicArtist.getText() + " playing loud, coming from the old " + etColor.getText() + " House. ";
                story += "\n Behind you, you hear a wierd sound that looks like its coming from a " + etNoun.getText() + ". ";
                story += "\n You begin to run towards the house when you hit you head on a dangling " + etFruit.getText() + " from the tree right in front of the house. ";
                story += "\n You walk into the house since it was open and in the living Room there is a video of " + etCelebrity.getText() + " " + etVerb.getText() + ". ";
                story += "\n You are kind of wierded out since the house is clearly abandoned. In the Video you hear " + etSong.getText() + " playing in the background. ";
                story += "\n Upstarirs you find a clean couch with a tv that has power. You turn on the tv and sit on the couch. You change the channel to " + etTvShow.getText() + " and watch that for the rest of the night. ";
                story += "\n In the morning you walk out of the house and eat the " + etFruit.getText() + " that you hit your head on. You walk out of the forest and didn't tell anyone what you found.";
                secondActivity.putExtra("story",story);

                startActivity(secondActivity);
            }
        });


    }



}