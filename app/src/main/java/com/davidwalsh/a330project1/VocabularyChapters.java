package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VocabularyChapters extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_chapters);
    }

    public void enterChapterOneVocab(View view)
    {
        Intent i = new Intent(VocabularyChapters.this,VocabularyActivity.class);
        i.putExtra("chapter",1);
        startActivity(i);
    }
    public void enterChapterTwoVocab(View view)
    {
        Intent i = new Intent(VocabularyChapters.this,VocabularyActivity.class);
        i.putExtra("chapter",2);
        startActivity(i);
    }
    public void enterChapterThreeVocab(View view)
    {
        Intent i = new Intent(VocabularyChapters.this,VocabularyActivity.class);
        i.putExtra("chapter",3);
        startActivity(i);
    }
    public void enterChapterFourVocab(View view)
    {
        Intent i = new Intent(VocabularyChapters.this,VocabularyActivity.class);
        i.putExtra("chapter",4);
        startActivity(i);
    }
}
