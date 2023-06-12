package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibRegularDayActivity extends AppCompatActivity {

    private EditText tvName, tvColor, tvNoun, tvAdjective, tvDay, tvItem, tvWord, tvRandom;
    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_regularday);

        tvName = findViewById(R.id.tv_name);
        tvColor = findViewById(R.id.tv_color);
        tvNoun = findViewById(R.id.tv_noun);
        tvAdjective = findViewById(R.id.tv_adjective);
        tvDay = findViewById(R.id.tv_day);
        tvItem = findViewById(R.id.tv_item);
        tvWord = findViewById(R.id.tv_word);
        tvRandom = findViewById(R.id.tv_random);
        tvNoun = findViewById(R.id.tv_noun);

        btnGenerate = findViewById(R.id.btn_generate);

        Intent intentDisplay = new Intent(MadLibRegularDayActivity.this, MadLibRegularDayDisplayActivity.class);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = "";
                story += "\t Just a regular ol day sunny, beautiful, bright day everything id going good then suddenly... ";
                story += "\nYou recieve a message from " + tvName.getText() + ". They are in danger of a major crisis they need help \n They need help because someone is chasing them so " + tvName.getText() + " tells you that they are wearing a " + tvColor.getText() + " Shirt and black pants but they have a mask on so " + tvName.getText() +  " Cannot describe them";
                story += "\nBut " + tvName.getText() + " realizes that " + tvNoun.getText() + " is very" + tvAdjective.getText() + " and that may help with finding out who is chasing them. \n So on a random " + tvDay.getText() + " that was going so well you are on a chase to find out who this person is.";
                story += "\t Your still on the phone with " + tvName.getText() + " so you tell them to get a " + tvItem.getText() + " and try to throw it at the person chasimng them... \t well that doesnt work the person says " + tvWord.getText() + " and chases " + tvName.getText() + " even faster. ";
                story +="\nThen " + tvName.getText() + " starts to worry and screams " + tvRandom.getText() + " and then suddenly the person who was chasing " + tvName.getText() + "runs in fear \t finally  everything is all fine at the end of the day in all good sake of " + tvNoun.getText() + ".";
                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);
            }
        });




    }
}