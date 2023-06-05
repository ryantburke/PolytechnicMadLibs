package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibJoesActivity extends AppCompatActivity {


    private EditText etAdj1;
    private EditText etColor1;
    private EditText etVehicle;
    private EditText etAdj2;
    private EditText etColor2;
    private EditText etNumber;
    private EditText etFruit;
    private EditText etBody_Part;
    private EditText etFruit2;
    private EditText etPlace;






    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_joes);

        //assign variables to objects
        etAdj1 = findViewById(R.id.et_adjective);
        etColor1 = findViewById(R.id.et_color);
        etVehicle = findViewById(R.id.et_vehicle);
        etAdj2 = findViewById(R.id.et_adjective2);
        etColor2 = findViewById(R.id.et_color2);
        etNumber = findViewById(R.id.et_number);
        etFruit = findViewById(R.id.et_fruit);
        etBody_Part = findViewById(R.id.et_bodyPart);
        etFruit2 = findViewById(R.id.et_fruit2);
        etPlace = findViewById(R.id.et_place);



        btnGenerate = findViewById(R.id.btn_generate);


        Intent intentDisplay = new Intent(MadLibJoesActivity.this, MadLibsJoesDisplayActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "";
                story += "\nAfter a " + etAdj1.getText() + " day at school you get in your car and start driving home, when a " + etColor1.getText()+ " " + etVehicle.getText() + " " + "crashes into you at a red light!";
                story += " Now after having to deal with a " + etAdj2.getText() + " man you eventually make it home.";
                story += " You put on your " + etColor2.getText() + " Joe's shirt and get ready to leave for work.";
                story += " You show up " + etNumber.getText() + " minutes early because you love your job.";
                story += " You check the ice cream flavors for today and realize " + etFruit.getText() + " is the flavor of the day.";
                story += " You head inside, clock in, and get started helping customers.";
                story += " As you're scooping ice you slip, fall, and hit your " + etBody_Part.getText() + " on a sharp object and it comes off completely.";
                story += " As everyone is searching for your lost " + etBody_Part.getText() + " your manager sees it in the " + etFruit2.getText() + " ice cream that we just finished serving to the customer.";
                story += " You see your " + etBody_Part.getText() + " and immediately faint.";
                story += " When you wake up, you realize that you are at " + etPlace.getText() + ", so you reach for your " + etBody_Part.getText() + " and realize it was all a dream.";

                intentDisplay.putExtra("story",story);

                startActivity(intentDisplay);
            }
        });
    }

}