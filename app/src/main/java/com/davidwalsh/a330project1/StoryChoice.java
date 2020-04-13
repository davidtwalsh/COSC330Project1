package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StoryChoice extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_choice);
    }

    public void enterMariahStory(View view)
    {
        Intent i = new Intent(StoryChoice.this,StoryActivity.class);
        i.putExtra("name","Mariah");
        startActivity(i);
    }
    public void enterJohnStory(View view)
    {
        Intent i = new Intent(StoryChoice.this,StoryActivity.class);
        i.putExtra("name","John");
        startActivity(i);
    }
    public void enterAliciaStory(View view)
    {
        Intent i = new Intent(StoryChoice.this,StoryActivity.class);
        i.putExtra("name","Alicia");
        startActivity(i);
    }
    public void enterLarisaStory(View view)
    {
        Intent i = new Intent(StoryChoice.this,StoryActivity.class);
        i.putExtra("name","Larisa");
        startActivity(i);
    }
}
