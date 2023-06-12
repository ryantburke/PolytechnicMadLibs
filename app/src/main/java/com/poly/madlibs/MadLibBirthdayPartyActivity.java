package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MadLibBirthdayPartyActivity extends AppCompatActivity {

    EditText etName;
    EditText etAge;
    EditText etNoun;
    EditText etActivity;
    EditText etVerb;
    EditText etVerb2;
    EditText etName2;
    EditText etSong;
    EditText etAdjective;
    EditText etName3;
    EditText etAdjective2;


    Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_birthdayparty);

        etName = findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        etNoun = findViewById(R.id.et_noun);
        etActivity = findViewById(R.id.et_activity);
        etVerb = findViewById(R.id.et_verb);
        etVerb2 = findViewById(R.id.et_verb2);
        etName2 = findViewById(R.id.et_name2);
        etSong = findViewById(R.id.et_song);
        etAdjective = findViewById(R.id.et_adjective);
        etName3 = findViewById(R.id.et_name3);
        etAdjective2 = findViewById(R.id.et_adjective2);
        EditText[] etAll = {etName, etAge, etNoun, etActivity, etVerb, etVerb2, etName2, etSong, etAdjective, etName3, etAdjective2};

        btnNextPage = findViewById(R.id.btn_generatestory);

        MadLibUtil.prepareStory(etAll, btnNextPage);

        Intent secondActivity = new Intent(MadLibBirthdayPartyActivity.this, MadLibBirthdayPartyDisplayActivity.class);

        String sendThisString = "Whatever string I want to send";
        String sendThisToo = "The other string I want to send";

        secondActivity.putExtra("data1", sendThisString);
        secondActivity.putExtra("data2", sendThisToo);

        btnNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String story = "The Birthday Party!!!";
                 story += "\nYesterday I went to " + etName.getText() + "'s " + etAge.getText() + "th" + " birthday party. ";
                 story += "\nI got him/her a " + etNoun.getText() + ". ";
                 story += "\nWe started by playing " + etActivity.getText() + " and then there was a "+ etVerb.getText() + " party. ";
                 story += "\nBefore cutting the cake everyone " + etVerb2.getText() + ". " + etName2.getText() + " started to sing " + etSong.getText() + ". ";
                 story += "\nI had a " + etAdjective.getText() + " time at the party and enjoyed celebrating " + etName3.getText() + ". ";
                 story += "\nHe/She is such a " + etAdjective2.getText() + " friend.";

                 secondActivity.putExtra("story",story);



                startActivity(secondActivity);
            }
        });
    }

}