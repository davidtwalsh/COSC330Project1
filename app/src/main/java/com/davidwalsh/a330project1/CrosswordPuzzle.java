package com.davidwalsh.a330project1;

import android.app.Activity;

import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

import android.util.Log;
import android.widget.TextView;
import android.widget.EditText;
import android.media.MediaPlayer;
public class CrosswordPuzzle extends Activity {

    MediaPlayer scoreSnd;

    TextView cxDown1;
    TextView cxAcross4;
    TextView cxDown5;
    TextView cxDown2;
    TextView cxDown3;
    TextView cxAcross7;
    TextView cxAcross8;
    TextView cxDown6;

    EditText cx1dash1;
    EditText cx1dash2;
    EditText cx1dash3;
    EditText cx1dash4;
    EditText cx1dash5;
    EditText cx1dash6;
    EditText cx1dash7;
    EditText cx1dash8;

    EditText cx4dash1;
    EditText cx4dash3;
    EditText cx4dash4;
    EditText cx4dash5;
    EditText cx4dash6;
    EditText cx4dash7;
    EditText cx4dash8;
    EditText cx4dash9;
    EditText cx4dash10;
    EditText cx4dash11;
    EditText cx4dash12;
    EditText cx4dash13;

    EditText cx5dash2;
    EditText cx5dash3;
    EditText cx5dash4;
    EditText cx5dash5;

    EditText cx2dash1;
    EditText cx2dash2;
    EditText cx2dash4;
    EditText cx2dash5;
    EditText cx2dash6;
    EditText cx2dash7;
    EditText cx2dash8;

    EditText cx3dash1;
    EditText cx3dash3;
    EditText cx3dash4;
    EditText cx3dash5;
    EditText cx3dash6;
    EditText cx3dash7;
    EditText cx3dash8;

    EditText cx7dash1;
    EditText cx7dash3;
    EditText cx7dash5;

    EditText cx8dash1;
    EditText cx8dash2;
    EditText cx8dash3;
    EditText cx8dash4;
    EditText cx8dash6;
    EditText cx8dash8;

    EditText cx6dash1;
    EditText cx6dash2;
    EditText cx6dash3;
    EditText cx6dash5;
    EditText cx6dash6;

    Boolean c1;
    Boolean c2;
    Boolean c3;
    Boolean c4;
    Boolean c5;
    Boolean c6;
    Boolean c7;
    Boolean c8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossword_puzzle);

        scoreSnd = MediaPlayer.create(this,R.raw.correct);
        c1 = c2 = c3 = c4 = c5 = c6 = c7 = c8 = false;

        cxDown1 = (TextView)findViewById(R.id.cxDown1);
        cxAcross4 = findViewById(R.id.cxAcross4);
        cxDown5 = findViewById(R.id.cxDown5);
        cxDown2 = findViewById(R.id.cxDown2);
        cxDown3 = findViewById(R.id.cxDown3);
        cxAcross7 = findViewById(R.id.cxAcross7);
        cxAcross8 = findViewById(R.id.cxAcross8);
        cxDown6 = findViewById(R.id.cxDown6);

        cx1dash1 = findViewById(R.id.cx1_1);
        cx1dash2 = findViewById(R.id.cx1_2);
        cx1dash3 = findViewById(R.id.cx1_3);
        cx1dash4 = findViewById(R.id.cx1_4);
        cx1dash5 = findViewById(R.id.cx1_5);
        cx1dash6 = findViewById(R.id.cx1_6);
        cx1dash7 = findViewById(R.id.cx1_7);
        cx1dash8 = findViewById(R.id.cx1_8);

        cx4dash1 = findViewById(R.id.cx4_1);
        cx4dash3 = findViewById(R.id.cx4_3);
        cx4dash4 = findViewById(R.id.cx4_4);
        cx4dash5 = findViewById(R.id.cx4_5);
        cx4dash6 = findViewById(R.id.cx4_6);
        cx4dash7 = findViewById(R.id.cx4_7);
        cx4dash8 = findViewById(R.id.cx4_8);
        cx4dash9 = findViewById(R.id.cx4_9);
        cx4dash10 = findViewById(R.id.cx4_10);
        cx4dash11= findViewById(R.id.cx4_11);
        cx4dash12 = findViewById(R.id.cx4_12);
        cx4dash13 = findViewById(R.id.cx4_13);

        cx5dash2 = findViewById(R.id.cx5_2);
        cx5dash3 = findViewById(R.id.cx5_3);
        cx5dash4 = findViewById(R.id.cx5_4);
        cx5dash5 = findViewById(R.id.cx5_5);

        cx2dash1 = findViewById(R.id.cx2_1);
        cx2dash2 = findViewById(R.id.cx2_2);
        cx2dash4 = findViewById(R.id.cx2_4);
        cx2dash5 = findViewById(R.id.cx2_5);
        cx2dash6 = findViewById(R.id.cx2_6);
        cx2dash7 = findViewById(R.id.cx2_7);
        cx2dash8 = findViewById(R.id.cx2_8);

        cx3dash1 = findViewById(R.id.cx3_1);
        cx3dash3 = findViewById(R.id.cx3_3);
        cx3dash4 = findViewById(R.id.cx3_4);
        cx3dash5 = findViewById(R.id.cx3_5);
        cx3dash6 = findViewById(R.id.cx3_6);
        cx3dash7 = findViewById(R.id.cx3_7);
        cx3dash8 = findViewById(R.id.cx3_8);

        cx7dash1 = findViewById(R.id.cx7_1);
        cx7dash3 = findViewById(R.id.cx7_3);
        cx7dash5 = findViewById(R.id.cx7_5);

        cx8dash1 = findViewById(R.id.cx8_1);
        cx8dash2 = findViewById(R.id.cx8_2);
        cx8dash3 = findViewById(R.id.cx8_3);
        cx8dash4 = findViewById(R.id.cx8_4);
        cx8dash6 = findViewById(R.id.cx8_6);
        cx8dash8 = findViewById(R.id.cx8_8);

        cx6dash1 = findViewById(R.id.cx6_1);
        cx6dash2 = findViewById(R.id.cx6_2);
        cx6dash3 = findViewById(R.id.cx6_3);
        cx6dash5 = findViewById(R.id.cx6_5);
        cx6dash6 = findViewById(R.id.cx6_6);


        Timer timer = new Timer();
        // Set the schedule function
        timer.scheduleAtFixedRate(new TimerTask() {
                                      @Override
                                      public void run() {
                                          //Log.d("zzoop","zzzzzoooooop");
                                          checkAnswers();
                                      }
                                  },
                0, 2000);   // 1000 Millisecond  = 1 second
    }

    void checkAnswers()
    {
        if (cx1dash1.getText().toString().equals("v") && cx1dash2.getText().toString().equals("i") && cx1dash3.getText().toString().equals("t")&& cx1dash4.getText().toString().equals("a")&& cx1dash5.getText().toString().equals("m")&& cx1dash6.getText().toString().equals("i")&& cx1dash7.getText().toString().equals("n")&& cx1dash8.getText().toString().equals("s"))
        {
            cxDown1.setTextColor(getResources().getColor(R.color.colorGreen));
            cx1dash1.setEnabled(false);
            cx1dash2.setEnabled(false);
            cx1dash3.setEnabled(false);
            cx1dash4.setEnabled(false);
            cx1dash5.setEnabled(false);
            cx1dash6.setEnabled(false);
            cx1dash7.setEnabled(false);
            cx1dash8.setEnabled(false);
            if (c1 == false)
                scoreSnd.start();
            c1 = true;
        }
        if (cx4dash1.getText().toString().equals("c") && cx1dash4.getText().toString().equals("a") && cx4dash3.getText().toString().equals("r")&& cx4dash4.getText().toString().equals("b")&& cx4dash5.getText().toString().equals("o")&& cx4dash6.getText().toString().equals("h")&& cx4dash7.getText().toString().equals("y")&& cx4dash8.getText().toString().equals("d")&& cx4dash9.getText().toString().equals("r")&& cx4dash10.getText().toString().equals("a")&& cx4dash11.getText().toString().equals("t")&& cx4dash12.getText().toString().equals("e")&& cx4dash13.getText().toString().equals("s"))
        {
            cxAcross4.setTextColor(getResources().getColor(R.color.colorGreen));
            cx4dash1.setEnabled(false);
            cx1dash4.setEnabled(false);
            cx4dash3.setEnabled(false);
            cx4dash4.setEnabled(false);
            cx4dash5.setEnabled(false);
            cx4dash6.setEnabled(false);
            cx4dash7.setEnabled(false);
            cx4dash8.setEnabled(false);
            cx4dash9.setEnabled(false);
            cx4dash10.setEnabled(false);
            cx4dash11.setEnabled(false);
            cx4dash12.setEnabled(false);
            cx4dash13.setEnabled(false);
            if (c2 == false)
                scoreSnd.start();
            c2 = true;
        }
        if (cx4dash5.getText().toString().equals("o") && cx5dash2.getText().toString().equals("b") && cx5dash3.getText().toString().equals("e") && cx5dash4.getText().toString().equals("s") && cx5dash5.getText().toString().equals("e"))
        {
            cxDown5.setTextColor(getResources().getColor(R.color.colorGreen));
            cx4dash5.setEnabled(false);
            cx5dash2.setEnabled(false);
            cx5dash3.setEnabled(false);
            cx5dash4.setEnabled(false);
            cx5dash5.setEnabled(false);
            if (c3 == false)
                scoreSnd.start();
            c3 = true;

        }
        if (cx2dash1.getText().toString().equals("e") && cx2dash2.getText().toString().equals("x") && cx4dash12.getText().toString().equals("e")&& cx2dash4.getText().toString().equals("r")&& cx2dash5.getText().toString().equals("c")&& cx2dash6.getText().toString().equals("i")&& cx2dash7.getText().toString().equals("s")&& cx2dash8.getText().toString().equals("e"))
        {
            cxDown2.setTextColor(getResources().getColor(R.color.colorGreen));
            cx2dash1.setEnabled(false);
            cx2dash2.setEnabled(false);
            cx4dash12.setEnabled(false);
            cx2dash4.setEnabled(false);
            cx2dash5.setEnabled(false);
            cx2dash6.setEnabled(false);
            cx2dash7.setEnabled(false);
            cx2dash8.setEnabled(false);
            if (c4 == false)
                scoreSnd.start();
            c4 = true;
        }
        if (cx3dash1.getText().toString().equals("c") && cx4dash10.getText().toString().equals("a") && cx3dash3.getText().toString().equals("l") && cx3dash4.getText().toString().equals("o")&& cx3dash5.getText().toString().equals("r")&& cx3dash6.getText().toString().equals("i")&& cx3dash7.getText().toString().equals("e") && cx3dash8.getText().toString().equals("s")    )
        {
            cxDown3.setTextColor(getResources().getColor(R.color.colorGreen));
            cx3dash1.setEnabled(false);
            cx4dash10.setEnabled(false);
            cx3dash3.setEnabled(false);
            cx3dash4.setEnabled(false);
            cx3dash5.setEnabled(false);
            cx3dash6.setEnabled(false);
            cx3dash7.setEnabled(false);
            cx3dash8.setEnabled(false);
            if (c5 == false)
                scoreSnd.start();
            c5 = true;
        }
        if (cx7dash1.getText().toString().equals("f") && cx3dash5.getText().toString().equals("r") && cx7dash3.getText().toString().equals("u")&& cx2dash6.getText().toString().equals("i") && cx7dash5.getText().toString().equals("t")  )
        {
            cxAcross7.setTextColor(getResources().getColor(R.color.colorGreen));
            cx7dash1.setEnabled(false);
            cx7dash3.setEnabled(false);
            cx7dash5.setEnabled(false);
            cx3dash5.setEnabled(false);
            cx2dash6.setEnabled(false);
            if (c6 == false)
                scoreSnd.start();
            c6 = true;
        }
        if (cx8dash1.getText().toString().equals("d") && cx8dash2.getText().toString().equals("i")&& cx8dash3.getText().toString().equals("a") && cx8dash4.getText().toString().equals("b")&& cx3dash7.getText().toString().equals("e")&& cx8dash6.getText().toString().equals("t")&& cx2dash8.getText().toString().equals("e")&& cx8dash8.getText().toString().equals("s"))
        {
            cxAcross8.setTextColor(getResources().getColor(R.color.colorGreen));
            cx8dash1.setEnabled(false);
            cx8dash2.setEnabled(false);
            cx8dash3.setEnabled(false);
            cx8dash4.setEnabled(false);
            cx8dash6.setEnabled(false);
            cx8dash8.setEnabled(false);
            cx3dash7.setEnabled(false);
            cx2dash8.setEnabled(false);
            if (c7 == false)
                scoreSnd.start();
            c7 = true;
        }
        if (cx6dash1.getText().toString().equals("s") && cx6dash2.getText().toString().equals("o")&& cx6dash3.getText().toString().equals("d") && cx6dash5.getText().toString().equals("u") && cx6dash6.getText().toString().equals("m") && cx8dash2.getText().toString().equals("i"))
        {
            cxDown6.setTextColor(getResources().getColor(R.color.colorGreen));
            cx6dash1.setEnabled(false);
            cx6dash2.setEnabled(false);
            cx6dash3.setEnabled(false);
            cx6dash5.setEnabled(false);
            cx6dash6.setEnabled(false);
            cx8dash2.setEnabled(false);
            if (c8 == false)
                scoreSnd.start();
            c8 = true;
        }

    }


}
