package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PartsMatchChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts_match_choice);
    }

    public void enterPartsFullBody(View view)
    {
        startActivity(new Intent(PartsMatchChoice.this,PartsFullBody.class));
    }
    public void enterPartsHead(View view)
    {
        startActivity(new Intent(PartsMatchChoice.this,PartsHead.class));
    }
}
