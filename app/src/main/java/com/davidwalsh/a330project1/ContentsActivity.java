package com.davidwalsh.a330project1;

//import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContentsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);
    }

    public void enterTitleOne(View view)
    {
        startActivity(new Intent(ContentsActivity.this,VocabularyChapters.class));
    }
    public void enterTitleTwo(View view)
    {
        startActivity(new Intent(ContentsActivity.this,PuzzleSelect.class));
    }
    public void enterTitleThree(View view)
    {
        startActivity(new Intent(ContentsActivity.this,PartsMatchChoice.class));
    }
    public void enterTitleFour(View view)
    {
        startActivity(new Intent(ContentsActivity.this,StoryChoice.class));
    }
    public void enterTitleFive(View view)
    {
        startActivity(new Intent(ContentsActivity.this,ReadingSpeakingChoice.class));
    }
    @Override
    public void onBackPressed()
    {
        //do nothing
    }
}
