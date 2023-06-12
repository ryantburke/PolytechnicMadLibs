package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MadLibFoodingActivity extends AppCompatActivity {
    private Button btnGenerate;
    private EditText firstName;
    private EditText lastName;
    private EditText nouns;
    private EditText verb;
    private EditText adverb;
    private EditText noun;
    private EditText adjective;
    private EditText favoriteFoodSing;
    private EditText favoriteFoodPlur;
    private EditText favoriteColor;
    private EditText friendsName;
    private EditText daysInYear;
    private EditText friendsYear;
    private EditText amountMoney;
    private EditText trueOrFalse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fooding_main);

        firstName = findViewById(R.id.edit_fn);
        lastName = findViewById(R.id.edit_ln);
        nouns = findViewById(R.id.edit_nouns);
        verb = findViewById(R.id.edit_verb);
        adverb = findViewById(R.id.edit_adverb);
        noun = findViewById(R.id.edit_noun);
        adjective = findViewById(R.id.edit_adjective);
        favoriteFoodSing = findViewById(R.id.edit_ffs);
        favoriteFoodPlur = findViewById(R.id.edit_ffp);
        favoriteColor = findViewById(R.id.edit_favcol);
        friendsName = findViewById(R.id.edit_favcol);
        daysInYear = findViewById(R.id.edit_diy);
        friendsYear = findViewById(R.id.edit_friendsy);
        amountMoney = findViewById(R.id.edit_aom);
        trueOrFalse = findViewById(R.id.edit_tof);
        EditText[] etAll = {firstName, lastName, nouns, verb, adverb, noun, adjective, favoriteFoodSing, favoriteFoodPlur, favoriteColor, friendsName, daysInYear, friendsYear, amountMoney, trueOrFalse};

        btnGenerate = findViewById(R.id.btn_generate);


        MadLibUtil.prepareStory(etAll, btnGenerate);




        Intent intentDisplay = new Intent(MadLibFoodingActivity.this, MadLibFoodingDisplayActivity.class);


        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += "\nHi, my name is " + firstName.getText() + " " + lastName.getText() + ".";
                story += " I have a friend named " + friendsName.getText();
                story += ", me and " + friendsName.getText() + " have been friends for " + friendsYear.getText() + " years.";
                story += " Today we're going to go eat " + favoriteFoodPlur.getText() + ", because it's our favorite food.";
                story += " At the " + favoriteFoodSing.getText() + " shop, we met " + noun.getText() + ", he tried to order " + daysInYear.getText() + " " + favoriteFoodPlur.getText() + " for his \"friends\".";
                story += "\n\nHis \"friends\" are " + nouns.getText() + " they are a " + adjective.getText() + " group that " + verb.getText() + " people with consent.";
                story += " When the cops show up " + nouns.getText() + ", " + adverb.getText() + " get out of there.";
                story += " The " + nouns.getText() + " theme color is " + favoriteColor.getText() + " which is also " + noun.getText() + "'s" + " favorite color.";
                story += " I started yelling at " + noun.getText() + " for ordering " + daysInYear.getText() + " " + favoriteFoodPlur.getText() + ".";
                story += " We started fighting and " + noun.getText() + " got knocked out by " + friendsName.getText() + " stepping in.";
                story += "\n\nI was alright and luckily it was " + trueOrFalse.getText() + " that " + noun.getText() + " was gonna get the order, but we stopped them just in time." ;
                story += " I then paid $" + amountMoney.getText() + " for the " + favoriteFoodPlur.getText() + " and left with " + friendsName.getText() + " after.";
                story += "\n\nThe End";

                intentDisplay.putExtra("story",story);

                startActivity(intentDisplay);


            }
        });


    }
}