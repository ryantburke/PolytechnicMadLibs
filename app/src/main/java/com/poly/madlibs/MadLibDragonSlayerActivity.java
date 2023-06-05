package com.poly.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MadLibDragonSlayerActivity extends AppCompatActivity {

    private TextView tvTitle;
    private EditText etWarrior;
    private EditText etMage;
    private EditText etKing;
    private EditText etKingdom;
    private EditText etColor;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.madlib_dragonslayer);

        //connects the instance variables to the layout files
        tvTitle = findViewById(R.id.tv_title);
        etWarrior = findViewById(R.id.et_warrior);
        etMage = findViewById(R.id.et_mage);
        etKing = findViewById(R.id.et_king);
        etKingdom = findViewById(R.id.et_kingdom);
        etColor = findViewById(R.id.et_color);
        btnCreate = findViewById(R.id.btn_create);

        //Intent used to display my story on ActivityMain2
        Intent intentDisplay = new Intent(this, MadLibDragonSlayerDisplayActivity.class);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String story = "";
                story += "At a snowy mountain, two shadowy figures stood in front of a colossal stone gate. ";
                story += "One is clad in crimson armor. Their name is " + etWarrior.getText() + ". ";
                story += "The other is draped in a silver robe. Their name is " + etMage.getText() + ". ";
                story += "Hailing from the kingdom of " + etKingdom.getText() + ", they strive to slay the wicked dragon. ";
                story += "The mage, holding their grimoire, force the heavy gate open. ";
                story += "\n\nAs they enter, the stone gate closes behind them, leaving them in darkness. ";
                story += "Suddenly, a ball of blue flames launches towards them! " + etWarrior.getText() + " stands upright and slashes their sword at the projectile. ";
                story += "The fireball split in half, burning the walls beside them. ";
                story += "A loud roar echoes in the chamber. Torches on the moldy walls lit up with a ghastly blue flame. ";
                story += "\n\nWith the flames restoring their vision, the two heroes see the behemoth before them. ";
                story += "A dragon covered with obsidian scales lay atop of a mountain of gold. ";
                story += "Sparing no time, " + etWarrior.getText() + " unsheathes their sword and rushes to face the dragon. ";
                story += "\n\n\"For the king! For the eternal rule of king " + etKing.getText() + "!\" yells the warrior. ";
                story += "\n\nThe moment " + etWarrior.getText() + " charged, strange words spills out " + etMage.getText() + "'s mouth. ";
                story += "The grimoire glows menacingly in response. ";
                story += "As sword and claws clash, a heavy force pushes down on the dragon. ";
                story += "It glares at the puny human in silver. Fire starts condensing in its mouth but stopped as the crimson human continues to pester it. ";
                story += "Facing the barrage of the two heroes, the dragon very quickly becomes riddled with wounds. Sensing its demise, the dragon stops attacking. ";
                story += "\n\nAn ominous rumble fills the chamber hall... The torches dim — cracks appearing on the walls. ";
                story += "Chills ran down " + etMage.getText() + "'s back. They knew what was happening. ";
                story += "\n\n\"Get back here!\" " + etMage.getText() + " calls out. ";
                story += "\n\n" + etWarrior.getText() + " doesn't question them and retreats from the dragon. ";
                story += "" + etMage.getText() + " draws symbols in the air in quick succession while chanting. ";
                story += "Half of the pages in " + etMage.getText() + "'s grimoire bursts into flames. ";
                story += "Waves of mana emanates from their body causing a thick, opaque barrier to form around them. ";
                story += "At the same time, the dragon crouches into a huddle. A deep blue seeps out in between its scales. ";
                story += "\n\nSuddenly the rumbling stops. The hall becomes eerily silent. A second later, the dragon explodes with a blinding light. ";
                story += "The barrier barely withstood the impact, shattering into bits of fragmented light the moment the explosion abated. ";
                story += "" + etMage.getText() + "collapsed, heaving from the heavy toll. Their eyes shut tight with pain. ";
                story += "\n\n\"It has fallen. Let us return its core back to " + etKingdom.getText() + ".\" " + etMage.getText() + " wheezed. ";
                story += "\"Help me up.\" \n\n" + etWarrior.getText() + "didn't say anything. ";
                story += "" + etMage.getText() + "opened their eyes to find a sword through their chest.\n\n";
                story += "\"Why-\" " + etMage.getText() + "'s words got cut off as " + etWarrior.getText() + " skewers their sword into their throat. ";
                story += "Soon a " + etColor.getText() + "colored orb appears from the mage's chest. ";
                story += "The warrior stuff it into a pocket and walks over to the mutilated dragon.\n\n";
                story += " Within the mess was a glowing azure orb the size of their palm. Grabbing it, the warrior walks past the corpses, towards the shattered gate. ";
                story += "Without looking back, the figure in crimson walks into the raging blizzard — like a spot of blood in the sea of white.";

                intentDisplay.putExtra("story",story);

                startActivity(intentDisplay);

            }
        });

    }
}