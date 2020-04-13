package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReadingSpeakingChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_speaking_choice);
    }

    public void enterSpeakingChoice(View view)
    {
        startActivity(new Intent(ReadingSpeakingChoice.this,SpeakingChoice.class));
    }
    public void enterReadingChoice(View view)
    {
        startActivity(new Intent(ReadingSpeakingChoice.this,ReadingChoice.class));
    }
}
