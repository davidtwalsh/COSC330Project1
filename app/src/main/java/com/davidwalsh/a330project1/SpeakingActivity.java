package com.davidwalsh.a330project1;

import android.app.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeakingActivity extends Activity {

    TextView nameView;
    ImageView pictureView;
    TextView dialogue;
    Button backButton;
    Button nextButton;

    ArrayList<StoryPage> pages;
    int currentPage;
    StoryPage myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speaking);

        nameView = findViewById(R.id.sp_name);
        pictureView = findViewById(R.id.sp_picture);
        dialogue = findViewById(R.id.sp_text);
        backButton = findViewById(R.id.sp_backBtn);
        nextButton = findViewById(R.id.sp_nextBtn);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int chapter = extras.getInt("chapter");

            StoryPage tempPage;
            pages = new ArrayList<StoryPage>();

            switch(chapter)
            {
                case 1:

                    nameView.setText("Dialogue 1");

                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1part2),"Health Center: Hello, health center. How may I help you?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1),"Patient: Hello, this is Fatima Tuma. I want to make an appointment.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1part2),"Health Center: How do you spell your name?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1),"Patient: T U M A.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1part2),"Health Center: What is the problem?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1),"Patient: I have a headache and a sore throat.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1part2),"Health Center: Do you have a fever?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1),"Patient: No, I don't.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1part2),"Health Center: Okay, come in tomorrow at 10am.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue1),"Patient: Thank you.");
                    pages.add(tempPage);

                    break;

                case 2:
                    nameView.setText("Dialogue 2");

                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p1),"Doctor: Hello, my name is Dr. Weston. How may I help you?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p2),"Patient: I have a pain in my back.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p3),"Doctor: Do you have any other symptoms?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p4),"Patient: Yes, it hurts when I walk.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p5),"Doctor: I can give you some medicine to help. Take it twice a day.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p6),"Patient: How long should I take the medicine?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p7),"Doctor: Take all the medicine. It should last 1 week.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue2p8),"Patient: Thank you doctor.");
                    pages.add(tempPage);
                    break;
                case 3:
                    nameView.setText("Dialogue 3");

                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3pharm),"Pharmacist: Hello, how can I help you?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3patient),"Patient: I need to find an over-the-counter medicine for allergies.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3pharm),"Pharmacist: What are your symptoms?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3patient),"Patient: I have a headache and sneeze often.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3pharm),"Pharmacist: Here is a medicine that works for many people.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3patient),"Patient: Will this medicine cause side effects?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3pharm),"Pharmacist: The label says this medicine may make you feel sleepy.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3patient),"Patient: Is there a medicine that will not make you sleepy?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3pharm),"Pharmacist: Yes, try this one.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.dialogue3patient),"Patient: Thank you.");
                    pages.add(tempPage);
                    break;

                case 4:
                    nameView.setText("Dialogue 4");

                    tempPage = new StoryPage(getDrawable(R.drawable.larisa3),"Larisa: What fruits do you like to eat?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa3),"Marc: I like to eat oranges and apples.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa4),"Larisa: What vegetables do you like to eat?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa4),"Marc: I like to eat broccoli and carrots.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa4),"Larisa: Do you like to eat spinach?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa4),"Marc: No, I hate spinach. Do you like spinach?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa4),"Larisa: No, I do not like spinach either.");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa3),"Larisa: Do you like strawberries?");
                    pages.add(tempPage);
                    tempPage = new StoryPage(getDrawable(R.drawable.larisa3),"Marc: Yes, strawberries are my favorite food.");
                    pages.add(tempPage);
                    break;
            }
            displayFirstPage();

        }


    }

    void displayFirstPage()
    {
        currentPage = 0;
        myPage = pages.get(currentPage);
        dialogue.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }

    public void displayNextPage(View view)
    {
        if (currentPage < pages.size() -1)
            currentPage++;
        myPage = pages.get(currentPage);
        dialogue.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }
    public void displayLastPage(View view)
    {
        if (currentPage > 0)
            currentPage--;
        myPage = pages.get(currentPage);
        dialogue.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }

    class StoryPage{

        public Drawable pagePic;
        public String storyText;
        public StoryPage(Drawable _pagePic,String _storyText)
        {
            pagePic = _pagePic;
            storyText = _storyText;
        }
    }
}
