package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MadLibsWOOLOO2Activity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etAdjective;
    private EditText etAdverb;
    private EditText etName;
    private EditText etAlignment;
    private EditText etVerb;
    private EditText etWeapon;
    private EditText etAnimal;
    private EditText etNumber;
    private EditText etChoice;
    private EditText etAdjective2;
    private Button Generate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evan_activity_main);

            etNoun = findViewById(R.id.es_first);
            etAdjective = findViewById(R.id.es_second);
            etAdverb = findViewById(R.id.es_third);
            etName = findViewById(R.id.es_fourth);
            etAlignment = findViewById(R.id.es_fifth);
            etVerb = findViewById(R.id.es_sixth);
            etWeapon = findViewById(R.id.es_seventh);
            etAnimal = findViewById(R.id.es_eighth);
            etNumber = findViewById(R.id.es_ninth);
            etChoice = findViewById(R.id.es_tenth);
            etAdjective2 = findViewById(R.id.es_eleventh);
            Generate = findViewById(R.id.button);

        Intent WOOLOOGENERATION = new Intent(MadLibsWOOLOO2Activity.this, MadLibsWoolooStoryPickerActivity.class);

        Generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String storyFantasy = "";
                storyFantasy +="Welcome to Drenkon, " + etName.getText() + " , be careful not to upset the natives of this place as you will face consequences";
                storyFantasy += "You walk through The Forest of Dreams, be careful though because something " + etAdjective.getText() + " can show up.";
                storyFantasy += "As you walk through the forest you spot a " + etAnimal.getText() + ", a very common creature in the forest.";
                storyFantasy += "As you past The Forest of Dreams you come across a Wizard asking what your Alignment is " + etAlignment.getText() + " you said and asks you to follow him.";
                storyFantasy += "You follow the Wizard " + etAdverb.getText() + ", he whispered something then turned around and looks at you.";
                storyFantasy += "When he does that " + etNumber.getText() + " zombies show up surrounding you,he tells you that he is a Necromancer collecting travelers bodies to rule the world with his undead army.";
                storyFantasy += "You feel " + etVerb.getText() + " about the situation, but steel your resolve and get ready for your first fight in this world.";
                storyFantasy += "You draw your " + etWeapon.getText() + " and start using it to fight the zombies in front of you not knowing if you win or not.";
                storyFantasy += "You start winning the battle and eventually slayed the last zombie, now looking at the Necromancer he looks " + etAdjective2.getText() + ", but that doesn't stop you from killing him as well to stop him from making an army to rule the world.";
                storyFantasy += "As you walk past his body you see the familiar place of " + etNoun.getText() + ", and start walking towards it.";
                storyFantasy += "At last you make it only to find a note that says 'YOU HAVE " + etChoice.getText() + "' knowing that you finally remember everything.";

                String storyApocalypse = "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";
                storyApocalypse += "";

                String storyMedieval = "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";
                storyMedieval += "";

                String storyHell = "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";
                storyHell += "";

                WOOLOOGENERATION.putExtra("fantasy",storyFantasy);
                WOOLOOGENERATION.putExtra("apocalypse",storyApocalypse);
                WOOLOOGENERATION.putExtra("medieval",storyMedieval);
                WOOLOOGENERATION.putExtra("hell",storyHell);

                startActivity(WOOLOOGENERATION);
            }
        });


    }

}