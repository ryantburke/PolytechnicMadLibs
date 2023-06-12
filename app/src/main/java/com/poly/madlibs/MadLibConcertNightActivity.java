package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibConcertNightActivity extends AppCompatActivity {

    Button generateMadlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_concertnight);

        generateMadlib = findViewById(R.id.generateMadlib);

        Intent secondActivity = new Intent(MadLibConcertNightActivity.this, MadLibConcerNightDisplayActivity.class);

        EditText name = findViewById(R.id.name);
        EditText adjective = findViewById(R.id.adjective);
        EditText verb = findViewById(R.id.verb);
        EditText musicGenre = findViewById(R.id.musicGenre);
        EditText modeOfTransport = findViewById(R.id.modeOfTransport);
        EditText relationshipType = findViewById(R.id.relationshipType);
        EditText animal = findViewById(R.id.animal);
        EditText season = findViewById(R.id.season);
        EditText clothingItem = findViewById(R.id.clothingItem);
        EditText sport = findViewById(R.id.sport);

        EditText[] etAll = {name, adjective, verb, musicGenre, modeOfTransport, relationshipType, animal, season, clothingItem, sport};

        MadLibUtil.prepareStory(etAll,generateMadlib);

        generateMadlib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String story = "You just got tickets to see your favorite artist, " + name.getText() + " in concert tonight! ";
                story += "You are very excited because the artist is extremely " + adjective.getText() + " and always " + verb.getText() + "s on stage. ";
                story += "You usually do not like " + musicGenre.getText() + " music, but you make an exception because the tickets were free and you are cheap. ";
                story += "You and your " + relationshipType.getText() + " try to drive to the concert, but your car dies on the way there. ";
                story += "After being stuck on the freeway for 20 minutes, you and your " + relationshipType.getText() + " decide to ditch the car and take a " + modeOfTransport.getText() + " instead. ";
                story += "You guys are on your way again, until you spot a " + animal.getText() + " in the middle of the road. ";
                story += "You are confused because you never finished school and you thought that all " + animal.getText() + "s died in the " + season.getText() + ". ";
                story += "The " + animal.getText() + " " + verb.getText() + "s up to you and bites you, ripping your favorite " + clothingItem.getText() + ". ";
                story += "You are so frustrated that you don't even want to go to " + name.getText() + "'s concert anymore. ";
                story += "You see that a group of strangers started a game of " + sport.getText() + ", so you ditch your " + relationshipType.getText() + " and join them instead. ";


                secondActivity.putExtra("story", story);

                startActivity(secondActivity);
            }
        });



    }
}