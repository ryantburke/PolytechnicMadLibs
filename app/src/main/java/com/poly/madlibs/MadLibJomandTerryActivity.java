package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibJomandTerryActivity extends AppCompatActivity {

    private TextView tvTitle;
    private EditText etWeapon;
    private EditText etNoun;
    private EditText etAnimal;
    private EditText etName;
    private EditText etLocation;
    private EditText etAdjective;
    private EditText etOnomatopoeia;
    private EditText etBodyPart;
    private EditText etObject;
    private EditText etVerb2;


    private Button btnGenerate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.madlib_jomandterry);
        tvTitle = findViewById(R.id.tv_title);
        etWeapon = findViewById(R.id.et_weapon);
        etNoun = findViewById(R.id.et_noun);
        etAnimal = findViewById(R.id.et_animal);
        etName = findViewById(R.id.et_name);
        etLocation = findViewById(R.id.et_location);
        etAdjective = findViewById(R.id.et_adjective);
        etOnomatopoeia = findViewById(R.id.et_onomatopoeia);
        etBodyPart = findViewById(R.id.et_bodypart);
        etObject = findViewById(R.id.et_object);
        etVerb2 = findViewById(R.id.et_verb2);


        btnGenerate = findViewById(R.id.btn_generate);

        // Story
        // The first line is an example, please delete and start your own story
        Intent intentDisplay = new Intent(this, MadLibJomandTerryDisplayActivity.class);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";

                story += "\nIt's the middle of the night, and Jom is up to his usual shenanigans in catching Terry...";
                story += "\nUp and down and all around, Jom chased Terry through the " + etLocation.getText() + ".";
                story += "\nThen out of the corner of his eye, Jom saw THE Ms. " + etName.getText() + " on her porch.";
                story += "\nMadly in love, Jom forgets about Terry and immediately" + etVerb2 + "s to flirt with her.";
                story += "\nAs a romantic, Jom brought out his " + etObject.getText() + " from his pocket and begun to play into the night.";
                story += "\nTerry, seeing this, has a devious plan to annoy Jom...";
                story += "\nJom is too mesmerized by Ms. " + etName.getText() + " to realize Terry had brought a " + etAnimal.getText() + "!";
                story += "\nAND " + etOnomatopoeia.getText() + "! The " + etAnimal.getText() + " chomped on Jom's tail!!";
                story += "\nJom jumped " + etAdjective.getText() + "ly but kept his composure to impress Ms. " + etName.getText() + " and continued to play.";
                story += "\nAnnoyed, Terry tried again...";
                story += "\nUsing the same " + etAnimal.getText() + ", Terry hooked Jom's " + etNoun.getText() + " to the animal...";
                story += "\nThe " + etAnimal.getText() + " zoomed away and RIP! Jom's " + etNoun.getText() + " got ripped away, exposing his " + etBodyPart.getText() + "!";
                story += "\nJom turned bright red, embarrassing himself in front of Ms. " + etName.getText() + ", but he didn't give up! ";
                story += "\nIn one last attempt to win her over, Jom showed his love through his music amd continued to play his " + etObject.getText() + " into his final song.";
                story += "\nTerry also had one last trick up his sleeve...a " + etWeapon.getText();
                story += "\nHe tied the " + etWeapon.getText() + " to hang above Jom.";
                story += "\nAt long last, Jom reached the finale of his song, putting his heart and soul into the last note.";
                story += "\nTerry, grinning wildly, cut the rope, sending the " + etWeapon.getText() + " straight at Jom ANDDD " + etOnomatopoeia.getText() + "!!";
                story += "\n" + etName.getText() + " cringed and finally retreated into her home - All of Jom's effort and hard work had turned to nothing...";
                story += "\nJom turned hot red, took the " + etWeapon.getText() + " off his face, and began to " + etAdjective.getText() + " chase Terry into the night.";

                intentDisplay.putExtra("story", story);

                startActivity(intentDisplay);
            }
        });
    }
}