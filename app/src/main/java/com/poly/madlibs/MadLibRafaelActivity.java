package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibRafaelActivity extends AppCompatActivity {

    private EditText etAdjective, etNoun, etVerb, etColor, etShape, etLocation, etFood, etFriend;

    private Button btnGenerate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_rafael);

        //link objects to layout file
        etAdjective = findViewById(R.id.et_adjective);
        etNoun = findViewById(R.id.et_noun);
        etVerb = findViewById(R.id.et_verb);
        etColor = findViewById(R.id.et_Color);
        etShape = findViewById(R.id.et_Shape);
        etLocation = findViewById(R.id.et_Location);
        etFood = findViewById(R.id.et_Food);
        etFriend = findViewById(R.id.et_Friend);
        btnGenerate = findViewById(R.id.btn_generate);

        Intent intent = new Intent(MadLibRafaelActivity.this, MadLibRafaelDisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = "";
                story += "Today I am visiting a friend house " + etVerb.getText() + ". ";
                story += "My friend name is Maria " + etFriend.getText() + ". ";
                story += "We took a left, to try to go to her Maria house  " + etVerb.getText() + ". ";
                story += "We were already here in Maria house " + etLocation.getText() + ". ";
                story += "Maria's house was yellow " + etColor.getText() + ". ";
                story += "We went inside  " + etVerb.getText() + ". ";
                story += "Maria house is very cozy " + etAdjective.getText() + ". ";
                story += "Maria showed me her cute dog " + etAdjective.getText() + ". ";
                story += "Me and Maria found a bunch of dvd's and a dvd player " + etVerb.getText() + ". ";
                story += "The Dvd case was a square shape  " + etShape.getText() + ". ";
                story += "Me and Maria wanted to watch the Titanic movie " + etVerb.getText() + ". ";
                story += "We both thought the movie was great " + etAdjective.getText() + ". ";
                story += "We later wanted some marshmallows " + etVerb.getText() + ". ";
                story += "Me and Maria went to the kitchen " + etLocation.getText() + ". ";
                story += "Me and Maria founded some marshmallows " + etFood.getText() + ". ";
                story += "The marshmallows were a circle shape " + etShape.getText() + ". ";
                story += "Me and Maria lit a fire " + etVerb.getText() + ". ";
                story += "Me and Maria burn the marshmallow " + etVerb.getText() + ". ";
                story += "The marshmallow was crispy brown " + etColor.getText() + ". ";
                story += "Me and Maria ate the marshmallows " + etVerb.getText() + ". ";
                story += "But me and Maria still felt hungry " + etNoun.getText() + ". ";
                story += "Maria mom came to the kitchen " + etVerb.getText() + ". ";
                story += "Maria mom made us food " + etVerb.getText() + ". ";
                story += "Maria mom made us grilled meat" + etAdjective.getText() + ". ";
                story += "The grilled meat was a brownish color " + etColor.getText() + ". ";
                story += "Me and Maria ate the grilled meat " + etVerb.getText() + ". ";
                story += "Maria mom told us to go to sleep " + etVerb.getText() + ". ";
                story += "Me and Maria started whining " + etAdjective.getText() + ". ";
                story += "Stop whining told Maria mom " + etNoun.getText() + ". ";
                story += "Tomorrow will be a new day said Maria mom " + etNoun.getText() + ". ";
                story += "Me and Maria both nod " + etVerb.getText() + ". ";
                story += "We both went to Maria bedroom " + etLocation.getText() + ". ";
                story += "Maria bedroom was huge " + etAdjective.getText() + ". ";
                story += "Me and Maria went to bed " + etVerb.getText() + ". ";
                story += "Me and Maria went to sleep " + etVerb.getText() + ". ";
                story += "And that was the day visiting Maria house " + etNoun.getText() + ". ";
                intent.putExtra("story",story);
                startActivity(intent);


            }
        });


        //add  button

    }
}