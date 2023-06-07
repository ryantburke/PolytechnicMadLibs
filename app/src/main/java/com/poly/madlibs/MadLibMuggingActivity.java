package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibMuggingActivity extends AppCompatActivity {


    Button btnNextPage;
    private EditText etName;

    private EditText etCity;

    private EditText etObject;

    private EditText etVerb;

    private EditText etObject2;

    private EditText etName2;

    private EditText etAdjective;

    private EditText etEmotion;

    private EditText etVehicle;

    private EditText etObject3;




    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_mugging);

        etName = findViewById(R.id.et_name);
        etCity = findViewById(R.id.et_city);
        etObject = findViewById(R.id.et_object);
        etVerb = findViewById(R.id.et_verb);
        etObject2 = findViewById(R.id.et_object2);
        etName2 = findViewById(R.id.et_name2);
        etAdjective = findViewById(R.id.et_adjective);
        etEmotion = findViewById(R.id.et_emotion);
        etVehicle = findViewById(R.id.et_vehicle);
        etObject3 = findViewById(R.id.et_object3);



        btnNextPage = findViewById(R.id.btn_nextpage);



        Intent intentDisplay = new Intent(MadLibMuggingActivity.this, MadLibMuggingDisplayActivity.class);




         btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String story = "";
                story += "\nOn a fateful day in " + etCity.getText() + " " + etName.getText() + " was walking down the street, when all of a sudden, " + etName2.getText() + " " + etVerb.getText();
                story += "\ns out from the bushes with a " + etObject.getText() + ". Hand over the " + etObject2.getText() + " and nobody gets hurt. Hesitantly, " +  etName.getText() + " hands over their coveted ";
                story += "\n" + etObject2.getText() + ". With " +  etName2.getText() +"'s new " + etObject2.getText() + " in hand, they attack " +  etName.getText() + "anyways. As they are blacking out they see ";
                story += "\n" + etName2.getText() + "escaping in a " + etAdjective.getText() + " " + etVehicle.getText() + ". When " +  etName.getText() + "awakens, they are left " + etEmotion.getText();
                story += "\nas they realize they had been left with only a " + etObject3.getText() + "to their name." + "\nThe End";




                intentDisplay.putExtra("story",story);
                startActivity(intentDisplay);


            }


        });


    }
}