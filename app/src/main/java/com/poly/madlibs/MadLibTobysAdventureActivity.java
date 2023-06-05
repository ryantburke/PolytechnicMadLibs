package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibTobysAdventureActivity extends AppCompatActivity {


    private EditText etFood;
    private EditText etBusiness;
    private EditText etBadPassword;
    private EditText etAmountOfMoney;
    private EditText etLocation;
    private EditText etShape;
    private EditText etColor;
    private EditText etAdjective;
    private EditText etVerb;
    private EditText etNoun;
    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_tobysadventure);

        etFood = findViewById(R.id.et_food);
        etBusiness = findViewById(R.id.et_business);
        etBadPassword = findViewById(R.id.et_badPassword);
        etAmountOfMoney = findViewById(R.id.et_amountOfMoney);
        etLocation = findViewById(R.id.et_location);
        etShape = findViewById(R.id.et_shape);
        etColor = findViewById(R.id.et_color);
        etAdjective = findViewById(R.id.et_adjective);
        etVerb = findViewById(R.id.et_verb);
        etNoun = findViewById(R.id.et_noun);

        btnGenerate = findViewById(R.id.btn_generate);

        Intent intentSecondary = new Intent(this, MadLibTobysAdventureDisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = "";

                story   += "Toby is a small cat, a white and orange cat."
                        + " Toby is really silly, nothing can pass through that silly brain of his."
                        + " Toby's favorite dish is " + etFood.getText() + "."
                        + " As Toby is eating, a giant " + etColor.getText() + " meteorite hits down his house."
                        + " Toby tries to relocate to " + etLocation.getText() + "."
                        + " This beings Toby's Great Adventure!!"
                        + " But first Toby invests in the " + etBusiness.getText() + " stocks for a chance of making it big in life."
                        + " As of right now Toby only has " + etAmountOfMoney.getText() + " in his bank account."
                        + " As Toby tries to login, he forgets his password."
                        + " What a Silly Cat he is."
                        + " Toby is thinking of changing his password, Toby makes the decision of changing to " + etBadPassword.getText() + "."
                        + " Now lets hope he doesn't forget it."
                        + " Now that we get that out of the way, Toby brings his " + etShape.getText() + "mouse toy, this " + etShape.getText() + " mouse toy is only exclusive in his timeline, must be a really weird universe Toby lives in."
                        + " Toby was on the road, Toby can't drive since Cats are known for drinking milk while driving. " + "But Toby isn't like that, Toby is a small cat that would never do that."
                        + " As Toby, " + etVerb.getText() + " with one eye closed, reaches his destination."
                        + " Toby is finally at " + etLocation.getText() + " !"
                        + " Toby finds a new place to stay with his Family."
                        + " The walk was not far from his parents place."
                        + " As Toby pounces he sees a " + etNoun.getText() + " rolling in a 45 degreee angle down a hill."
                        + " Toby meets up with his cousins and family. "
                        + " Toby is " + etAdjective.getText() + " to see his family."
                        + " Toby's mom makes his favorite dish, " + etFood.getText() + " while everything is going well in live, Toby finally feels at home once again";

                intentSecondary.putExtra("story",story);
                startActivity(intentSecondary);


            }
        });

    }
}