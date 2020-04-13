package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpeakingChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking_choice);
    }

    public void enterChapterOne(View view)
    {
        Intent i = new Intent(SpeakingChoice.this,SpeakingActivity.class);
        i.putExtra("chapter",1);
        startActivity(i);
    }
    public void enterChapterTwo(View view)
    {
        Intent i = new Intent(SpeakingChoice.this,SpeakingActivity.class);
        i.putExtra("chapter",2);
        startActivity(i);
    }
    public void enterChapterThree(View view)
    {
        Intent i = new Intent(SpeakingChoice.this,SpeakingActivity.class);
        i.putExtra("chapter",3);
        startActivity(i);
    }
    public void enterChapterFour(View view)
    {
        Intent i = new Intent(SpeakingChoice.this,SpeakingActivity.class);
        i.putExtra("chapter",4);
        startActivity(i);
    }
}
