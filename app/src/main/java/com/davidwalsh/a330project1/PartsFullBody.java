package com.davidwalsh.a330project1;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.widget.Toast;

public class PartsFullBody extends Activity {

    TextView footText;
    ImageView footArrow;
    Button footButton;

    TextView handText;
    ImageView handArrow;
    Button handButton;

    TextView armText;
    ImageView armArrow;
    Button armButton;

    TextView stomachText;
    ImageView stomachArrow;
    Button stomachButton;

    TextView chestText;
    ImageView chestArrow;
    Button chestButton;

    TextView shoulderText;
    ImageView shoulderArrow;
    Button shoulderButton;

    TextView headText;
    ImageView headArrow;
    Button headButton;

    MediaPlayer popSnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_full_body);

        popSnd = MediaPlayer.create(this,R.raw.pop);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Click a body part to reveal the name",
                Toast.LENGTH_SHORT);

        toast.show();

        footText = findViewById(R.id.fbFootText);
        footArrow = findViewById(R.id.fbFootArrow);
        footButton = findViewById(R.id.fbFootButton);
        footText.setVisibility(View.INVISIBLE);
        footArrow.setVisibility(View.INVISIBLE);

        handText = findViewById(R.id.fbHandText);
        handArrow = findViewById(R.id.fbHandArrow);
        handButton = findViewById(R.id.fbHandButton);
        handText.setVisibility(View.INVISIBLE);
        handArrow.setVisibility(View.INVISIBLE);

        armText = findViewById(R.id.fbArmText);
        armArrow = findViewById(R.id.fbArmArrow);
        armButton = findViewById(R.id.fbArmButton);
        armText.setVisibility(View.INVISIBLE);
        armArrow.setVisibility(View.INVISIBLE);

        stomachText = findViewById(R.id.fbStomachText);
        stomachArrow = findViewById(R.id.fbStomachArrow);
        stomachButton = findViewById(R.id.fbStomachButton);
        stomachText.setVisibility(View.INVISIBLE);
        stomachArrow.setVisibility(View.INVISIBLE);

        chestText = findViewById(R.id.fbChestText);
        chestArrow = findViewById(R.id.fbChestArrow);
        chestButton = findViewById(R.id.fbChestButton);
        chestText.setVisibility(View.INVISIBLE);
        chestArrow.setVisibility(View.INVISIBLE);

        shoulderText = findViewById(R.id.fbShoulderText);
        shoulderArrow = findViewById(R.id.fbShoulderArrow);
        shoulderButton = findViewById(R.id.fbShoulderButton);
        shoulderText.setVisibility(View.INVISIBLE);
        shoulderArrow.setVisibility(View.INVISIBLE);

        headText = findViewById(R.id.fbHeadText);
        headArrow = findViewById(R.id.fbHeadArrow);
        headButton = findViewById(R.id.fbHeadButton);
        headText.setVisibility(View.INVISIBLE);
        headArrow.setVisibility(View.INVISIBLE);
    }

    public void revealFoot(View view)
    {
        footText.setVisibility(View.VISIBLE);
        footArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealHand(View view)
    {
        handText.setVisibility(View.VISIBLE);
        handArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealArm(View view)
    {
        armText.setVisibility(View.VISIBLE);
        armArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealStomach(View view)
    {
        stomachText.setVisibility(View.VISIBLE);
        stomachArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealChest(View view)
    {
        chestText.setVisibility(View.VISIBLE);
        chestArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealShoulder(View view)
    {
        shoulderText.setVisibility(View.VISIBLE);
        shoulderArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealHead(View view)
    {
        headText.setVisibility(View.VISIBLE);
        headArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
}
