package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReadingChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading_choice);
    }
    public void enterReadingOne(View view)
    {
        Intent i = new Intent(ReadingChoice.this,ReadingActivity.class);
        i.putExtra("exercise",1);
        startActivity(i);
    }
    public void enterReadingTwo(View view)
    {
        Intent i = new Intent(ReadingChoice.this,ReadingActivity.class);
        i.putExtra("exercise",2);
        startActivity(i);
    }
    public void enterReadingThree(View view)
    {
        Intent i = new Intent(ReadingChoice.this,ReadingActivity.class);
        i.putExtra("exercise",3);
        startActivity(i);
    }

}
