package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibRoadTripActivity extends AppCompatActivity {

    private EditText etTime;
    private EditText etVerb;
    private EditText etVerb2;
    private EditText etAdj;
    private EditText etAdj2;
    private EditText etColor;
    private EditText etShape;
    private EditText etCity;
    private EditText etMoney;
    private EditText etArtist;
    private EditText etAnimal;
    private EditText etDrink;
    private EditText etFood;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_roadtrip);

        etTime = findViewById(R.id.et_time);
        etVerb = findViewById(R.id.et_verb);
        etVerb2 = findViewById(R.id.et_verb2);
        etAdj = findViewById(R.id.et_adj);
        etAdj2 = findViewById(R.id.et_adj2);
        etColor = findViewById(R.id.et_color);
        etShape = findViewById(R.id.et_shape);
        etCity = findViewById(R.id.et_city);
        etMoney = findViewById(R.id.et_money);
        etArtist = findViewById(R.id.et_artist);
        etAnimal = findViewById(R.id.et_animal);
        etDrink = findViewById(R.id.et_drink);
        etFood = findViewById(R.id.et_food);
        btnCreate = findViewById(R.id.btn_create);

        Intent intentDisplay = new Intent(MadLibRoadTripActivity.this, MadLibRoadTripDisplayActivity.class);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String story = "";
                story += "\nAt about " + etTime.getText() + ", on a " + etAdj.getText() + " day, you decide to go on a road trip by yourself. Having packed $" + etMoney.getText() + " and some " + etFood.getText() + ", you set on for your trip.";
                story += "\nYou didn't have an actual plan on where to go, so on a whim decide to go to " + etCity.getText() + ". Then you set forth for your trip";
                story += "\nYou feel the " + etAdj2.getText() + " breeze through the windows. The scenery isn't that bad and in the distance you spot a pretty " + etShape.getText() + " shaped building. You put on your favorite music artist, " + etArtist.getText() + ". Just as you begin to let yourself feel the music, a " + etAnimal.getText() + " abruptly jumps into the middle of the road causing you to slam on your brakes.";
                story += "\nYou try your best to stay on the road, but your car begins to swerve out of control and then flips over. You try calling for help but fail and soon your vision goes dark.";
                story += "\nA bit later..";
                story += "\nYou wake up with a " + etAdj.getText() + " headache. Not recognizing your surroundings, you begin to " + etVerb.getText() + ". Trying to figure out where you've ended up, you think that it must be some sort of backroom. Looking around, you notice a faint " + etColor.getText() + " light in the distance. You begin to " + etVerb2.getText() + " towards it but can never seem to make it there.";
                story += "\nDeciding to stop, you check your pockets and realize you still have your $" + etMoney.getText() + ".";
                story += "\nYour stomach begins to grumble and you think about your yummy " + etFood.getText() + ". You decide to just continue trying to find a way out.";
                story += "\nThe ground begins to rumble and you start to " + etVerb.getText() + " once again. Above you starts to rain what seems like " + etDrink.getText() + " and while you try to seek cover, there is nothing to protect you. In the distance you see a figure and try to make out what it is, and come to realize it is the " + etAnimal.getText() + " that was in the road before.";
                story += "\nYour vision starts to get dark once again and you try to " + etVerb.getText() + " once again, but then you fall to the ground, you see a hoard of " + etAnimal.getText() + "running at you. Then everything goes out once again.";
                story += "\nYour eyes open and you're all sweaty and dazed. You're pulled over on the side of the road, the " + etShape.getText() + " shaped building . You double check if you still have $" + etMoney.getText() + " and your " + etFood.getText() + " and everything is still where it was. Confused, you hear beeping and then your car explodes";
                story += "\nYou died. RIP bozo";


                intentDisplay.putExtra("story", story);
                startActivity(intentDisplay);

            }
        });




    }
}