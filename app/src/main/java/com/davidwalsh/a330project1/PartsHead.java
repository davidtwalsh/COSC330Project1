package com.davidwalsh.a330project1;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.widget.Toast;

public class PartsHead extends Activity {

    TextView neckText;
    ImageView neckArrow;
    Button neckButton;

    TextView eyeText;
    ImageView eyeArrow;
    Button eyeButton;

    TextView mouthText;
    ImageView mouthArrow;
    Button mouthButton;

    TextView earText;
    ImageView earArrow;
    Button earButton;

    TextView noseText;
    ImageView noseArrow;
    Button noseButton;

    MediaPlayer popSnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_head);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Click a body part to reveal the name",
                Toast.LENGTH_SHORT);

        toast.show();

        popSnd = MediaPlayer.create(this,R.raw.pop);
        neckText = findViewById(R.id.hNeckText);
        neckArrow = findViewById(R.id.hNeckArrow);
        neckButton = findViewById(R.id.hNeckButton);
        neckText.setVisibility(View.INVISIBLE);
        neckArrow.setVisibility(View.INVISIBLE);

        eyeText = findViewById(R.id.hEyeText);
        eyeArrow = findViewById(R.id.hEyeArrow);
        eyeButton = findViewById(R.id.hEyesButton);
        eyeText.setVisibility(View.INVISIBLE);
        eyeArrow.setVisibility(View.INVISIBLE);

        mouthText = findViewById(R.id.hMouthText);
        mouthArrow = findViewById(R.id.hMouthArrow);
        mouthButton = findViewById(R.id.hMouthButton);
        mouthText.setVisibility(View.INVISIBLE);
        mouthArrow.setVisibility(View.INVISIBLE);

        earText = findViewById(R.id.hEarText);
        earArrow = findViewById(R.id.hEarArrow);
        earButton = findViewById(R.id.hEarsButton);
        earText.setVisibility(View.INVISIBLE);
        earArrow.setVisibility(View.INVISIBLE);

        noseText = findViewById(R.id.hNoseText);
        noseArrow = findViewById(R.id.hNoseArrow);
        noseButton = findViewById(R.id.hNoseButton);
        noseText.setVisibility(View.INVISIBLE);
        noseArrow.setVisibility(View.INVISIBLE);
    }
    public void revealNeck(View view)
    {
        neckText.setVisibility(View.VISIBLE);
        neckArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealEye(View view)
    {
        eyeText.setVisibility(View.VISIBLE);
        eyeArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealMouth(View view)
    {
        mouthText.setVisibility(View.VISIBLE);
        mouthArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealEar(View view)
    {
        earText.setVisibility(View.VISIBLE);
        earArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
    public void revealNoise(View view)
    {
        noseText.setVisibility(View.VISIBLE);
        noseArrow.setVisibility(View.VISIBLE);
        popSnd.start();
    }
}
