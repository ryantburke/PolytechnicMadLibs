package com.poly.madlibs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibSummerVacationActivity extends AppCompatActivity {

    private EditText etName, etNoun, etLocation, etFavoriteActivity, etYourDreamVehicle, etFavoriteFoodOrDrink, etFriend1, etFriend2, etFavoriteSong, etPetName;
    private Button btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_summervacation);

        //link objects to layout file
        etName = findViewById(R.id.et_name);
        etNoun = findViewById(R.id.et_noun);
        etLocation = findViewById(R.id.et_location);
        etFavoriteActivity = findViewById(R.id.et_favoriteActivity);
        etYourDreamVehicle = findViewById(R.id.et_yourDreamVehicle);
        etFavoriteFoodOrDrink = findViewById(R.id.et_favoriteFoodOrDrink);
        etFriend1 = findViewById(R.id.et_friend1);
        etFriend2 = findViewById(R.id.et_friend2);
        etFavoriteSong = findViewById(R.id.et_favoriteSong);
        etPetName = findViewById(R.id.et_petName);
        btnGenerate = findViewById(R.id.btn_generate);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String story = "";
                story += "Its finally your summer vacation " + etName.getText() + "!";
                story += " Hey " + etFriend1.getText() + " and " + etFriend2.getText() + " lets go on a road trip!!";
                story += " We should go to " + etLocation.getText() + "!";
                story += " Great idea " + etName.getText() + ", and we can go " + etFavoriteActivity.getText() + "!";
                story += " We should take " + etFriend2.getText() + "'s " + etYourDreamVehicle.getText() + ".";
                story += " On the way there we can listen to " + etFavoriteSong.getText() + " and maybe even stop by a resturant and have some " + etFavoriteFoodOrDrink.getText() + "!";
                story += " Hey can we bring " + etFriend1.getText() + "'s dog, " + etPetName.getText() + " too?";
                story += " We should stay at the " + etNoun.getText() + " hotel.";
                story += " Of course!! This is gonna be the best summer road trip ever!!";

                setContentView(R.layout.madlib_summervacation_display);

                TextView tvStory = findViewById(R.id.tv_story);
                tvStory.setText(story);
            }
        });
    }
}
