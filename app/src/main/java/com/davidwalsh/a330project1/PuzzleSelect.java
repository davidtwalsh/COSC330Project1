package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PuzzleSelect extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_select);
    }

    public void enterWordSearch(View view)
    {
        startActivity(new Intent(PuzzleSelect.this,WordSearch.class));
    }

    public void enterCrossword(View view)
    {
        startActivity(new Intent(PuzzleSelect.this,CrosswordPuzzle.class));
    }
}
