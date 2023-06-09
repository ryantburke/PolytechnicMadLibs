package com.poly.madlibs;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibJadenActivity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etPluralNoun;
    private EditText etVerb;
    private EditText etAdj;
    private EditText etAdverb;
    private EditText etColor;
    private EditText etFood;
    private EditText etCeleb;
    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_jaden);


       etNoun = findViewById(R.id.et_noun);
       etPluralNoun = findViewById (R.id.et_plural_noun);
       etVerb = findViewById(R.id.et_verb);
       etAdj = findViewById(R.id.et_adj);
       etColor = findViewById(R.id.et_color);
       etAdverb = findViewById(R.id.et_adverb);
       etFood = findViewById(R.id.et_food);
       etCeleb = findViewById(R.id.et_celeb);
       btnNextPage = findViewById(R.id.btn_nextpage);

       btnNextPage.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               String story = "";
               story += "\n " + etNoun.getText() + " gets ready for the day and goes out for a walk.";
               story += "\n " + etNoun.getText() + " walks towards" + etAdj.getText() + " and plays around in it.";
               story += "\n " + etAdj.getText() + " then transforms into a " + etCeleb.getText() + " !";
               story += "\n " + etCeleb.getText() + " talks with " + etNoun.getText() + " and the both get on the magic " + etFood.getText() + " and fly high into the sky!";
               story += "\nSuddenly, " + etFood.getText() + " turns into a " + etPluralNoun.getText() + " car, and " + etNoun.getText() + " and " + etCeleb.getText() + " drive.";
               story += "\nBoth of our heroes then go to Domino's and get some pizza";
               story += "\nThe end";

               setContentView(R.layout.madlib_jaden_display);
               TextView tvStory = findViewById(R.id.tv_story);
               tvStory.setText(story);


        }
       });


    }
}