package com.poly.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
    private Button btnGenerate;
    private EditText[] etAll;

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
        etAll = new EditText[] {etNoun,etAdjective,etAdverb,etName,etAlignment,etVerb,etWeapon,etAnimal,etNumber,etChoice,etAdjective,etChoice,etAdjective2};

        btnGenerate = findViewById(R.id.button);
        btnGenerate.setEnabled(false);

        for (EditText et:etAll) {
            et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                }

                @Override
                public void afterTextChanged(Editable s) {
                    if (allFilled()) {
                        btnGenerate.setEnabled(true);
                    }
                }
            });
        }
        btnGenerate.setEnabled(allFilled());

        Intent WOOLOOGENERATION = new Intent(MadLibsWOOLOO2Activity.this, MadLibsWoolooStoryPickerActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String storyFantasy = "";
                storyFantasy +="Welcome to Drenkon, " + etName.getText() + ", be careful not to upset the natives of this place as you will face consequences";
                storyFantasy += " You walk through The Forest of Dreams, be careful though because something " + etAdjective.getText() + " can show up.";
                storyFantasy += " As you walk through the forest you spot a " + etAnimal.getText() + ", a very common creature in the forest.";
                storyFantasy += " As you past The Forest of Dreams you come across a Wizard asking what your Alignment is '" + etAlignment.getText() + "' you said and he asks you to follow him.";
                storyFantasy += " You follow the Wizard " + etAdverb.getText() + ", he whispered something then turned around and looks at you.";
                storyFantasy += " When he does that " + etNumber.getText() + " zombies show up surrounding you, he tells you that he is a Necromancer collecting travelers bodies to rule the world with his undead army.";
                storyFantasy += " You feel " + etVerb.getText() + " about the situation, but steel your resolve and get ready for your first fight in this world.";
                storyFantasy += " You draw your " + etWeapon.getText() + " and start using it to fight the zombies in front of you not knowing if you will win or not.";
                storyFantasy += " You start winning the battle and eventually slayed the last zombie, now looking at the Necromancer he looks " + etAdjective2.getText() + ", but that doesn't stop you from killing him as to stop him from making an undead army.";
                storyFantasy += " As you walk past his body you see the familiar place of " + etNoun.getText() + ", and start walking towards it.";
                storyFantasy += " At last you make it only to find a note that says 'YOU " + etChoice.getText() + "' knowing that you finally remember everything that happened.";

                String storyApocalypse = "";
                storyApocalypse += "In a place that is in ruins " + etName.getText() + " and Dinglevaious King the III arrived in " + etNoun.getText() + " where both of you are " + etAlignment.getText() + ".";
                storyApocalypse += " They both noticed " + etNoun.getText() + " had a " + etWeapon.getText() + " leading into a dimension with planes falling and building on fire.";
                storyApocalypse += " In the dimension " + etNumber.getText() + " of creatures appears, but what they don't notice is the deadly beast behind them.";
                storyApocalypse += " Behind them there was " + etAnimal.getText() + " with " + etNumber.getText() + " of legs! ";
                storyApocalypse += etName.getText() + " and Dinglevaious is " + etAdjective.getText() + " due to the " + etAdverb.getText() + " creature behind them. ";
                storyApocalypse += etName.getText() + " and Dinglevaious are " + etAdjective2.getText() + " but steel themselves for the worst and first fight of their life.";
                storyApocalypse += " Luckily they had " + etWeapon.getText() + " to help them defeat the boss, but with their lack of skill could they?";
                storyApocalypse += " After tireless fighting they finally " + etChoice.getText() + ".";

                String storyMedieval = "";
                storyMedieval += "Hey are you awake " + etName.getText() + "? We have to go now they are catching up.";
                storyMedieval += " 'Who are they?' " + etName.getText() + " asked. What are you talking about did you hit your head too hard.";
                storyMedieval += " While the both of you were talking a group of people apparently named the " + etAnimal.getText() + " ambushed you.";
                storyMedieval += " Nowhere to hide now " + etName.getText() + " and Riley. Now give us what we want or else things will go " + etAdjective.getText() + " for you.";
                storyMedieval += " Seeing that you can do nothing but fight you pull out your " + etWeapon.getText() + " and start fighting them.";
                storyMedieval += " After many exchange of blows both side look " + etAdjective2.getText() + " 'YOU GAVE ME NO CHOICE, BUT TO USE THIS!' the Bandit Leader said " + etAdverb.getText() + ".";
                storyMedieval += " The Bandit Leader then pulls out some kind of weapon of unknown origins that looks like a L but sideways, anyway knowing the danger you " + etVerb.getText() + " and get out of there.";
                storyMedieval += " Once you got away from the Bandits you walk into a familiar place called " + etNoun.getText() + ", Riley told you the name, but after some recuperation Riley explains somethings to you.";
                storyMedieval += " Apparently after going through " + etNumber.getText() + " of towns to find work you " + etChoice.getText() + " something of theirs and they want it back.";
                storyMedieval += " Something tells you that you were pretty " + etAlignment.getText() + " and should just get " + etNumber.getText() + " of gold for them.";
                storyMedieval += " After many days of collecting gold, you finally had enough gold to repay the bandits, but when you visited them, they were eaten by their mascot the " + etAnimal.getText() + ".";

                String storyHell = "";
                storyHell += "Nave is the King of Demons, he took the place of the previous king after the previous king lost to " + etNumber.getText() + etAnimal.getText() + "'s.";
                storyHell += " Suddenly a portal opens in hell revealing" + etName.getText() + ", apparently he was thrown in hell after " + etVerb.getText() + "ing into the place.";
                storyHell += " Nave tries to " + etVerb.getText() + etName.getText() + ", but then stops after finding out that " + etName.getText() + " wanted to help him.";
                storyHell += " Nave shows " + etName.getText() + " his weapon revealing " + etWeapon.getText() + " telling " + etName.getText() + " that it helps him collect souls to fuel his power.";
                storyHell += " After those events they go to " + etNoun.getText() + ", a place with countless souls.";
                storyHell += " Nave tells " + etName.getText() + " that if they don't get " + etNumber.getText() + " of souls by midnight then " + etName.getText() + " will be stuck in hell FOREVER.";
                storyHell += " Nave gives his " + etWeapon.getText() + " to " + etName.getText() + ", telling him to collect his first soul to escape.";
                storyHell += " After some conviction " + etName.getText() + " grabs the " + etWeapon.getText() + " and uses it " + etAdverb.getText() + ".";
                storyHell += " Before midnight hits they collected as much souls as they needed, but when they were finally about to collect the last soul a shadow loomed over them.";
                storyHell += " Nave tells " + etName.getText() + " to get back holding the beast off, but " + etName.getText() + ", but instead joins him to fight the " + etAdjective.getText() + ", a mindless beast, together and after a relentless fight they " + etChoice.getText() + ".";
                storyHell += " They go back to the castle and that's when " + etName.getText() + etChoice.getText() + "'s his life.";

                WOOLOOGENERATION.putExtra("fantasy",storyFantasy);
                WOOLOOGENERATION.putExtra("apocalypse",storyApocalypse);
                WOOLOOGENERATION.putExtra("medieval",storyMedieval);
                WOOLOOGENERATION.putExtra("hell",storyHell);

                startActivity(WOOLOOGENERATION);
            }
        });


    }

    private boolean isEmpty(EditText et) {
        return !et.getText().equals("");
    }

    private boolean allFilled() {
        for (EditText et:etAll) {
            if (isEmpty(et)) {
                return false;
            }
        }
        return true;
    }


}