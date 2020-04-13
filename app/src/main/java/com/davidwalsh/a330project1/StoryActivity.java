package com.davidwalsh.a330project1;

import android.app.Activity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Button;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

public class StoryActivity extends Activity {

    TextView nameView;
    ImageView pictureView;
    TextView storyText;
    Button backButton;
    Button nextButton;

    ArrayList<Page> pages;
    int currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        nameView = findViewById(R.id.st_name);
        pictureView = findViewById(R.id.st_picture);
        storyText = findViewById(R.id.st_storyText);
        backButton = findViewById(R.id.st_backBtn);
        nextButton = findViewById(R.id.st_nextBtn);

        pages = new ArrayList<Page>();
        currentPage = -1;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");

            Page tempPage;
            switch(name)
            {
                case "Mariah":
                    nameView.setText("Mariah's story");

                    tempPage = new Page(getDrawable(R.drawable.mariah1),"This is Mariah.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah2),"Mariah was sick.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah3),"She did not go to the doctor.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah4),"One night she could not breathe.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah5),"Her husband took her to the emergency room.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah6),"She stayed in the hospital for three days.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah7),"Mariah is sick again. She has a bad cough.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah9),"She calls her doctor to make an appointment.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah10),"She also asks for an interpreter.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah11),"At the health center they ask Mariah what her name is and if she has insurance. Mariah gives them her health insurance card.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah12),"They give her a form to fill out. The form is in English only.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.mariah10),"Mariah asks for an interpreter.");
                    pages.add(tempPage);
                    break;
                case "John":
                    nameView.setText("John's story");

                    tempPage = new Page(getDrawable(R.drawable.john),"John is 50 years old. He is a healthy man. Once a year he goes to his primary care physician for a checkup. John's father was not a healthy man");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.john),"He calls his primary care center to make an appointment. The woman on the phone tells him to come in on Tuesday at 4:30pm");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.john),"When he arrives at the primary care center, the front desk woman gives him a health history form. He fills out the form while he waits for the physician's assistant");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.john),"The form asks if John has any allergies or if John takes any medicines. He thinks of questions to ask the physician's assistant.");
                    pages.add(tempPage);
                    break;
                case "Alicia":
                    nameView.setText("Alicia's story");

                    tempPage = new Page(getDrawable(R.drawable.alicia),"Alicia went to the doctor. The doctor gave her a prescription.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.alicia),"Alicia took the prescription to the pharmacy. She gave the prescription to the pharmacist.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.alicia),"The pharmacist filled the prescription and gave her the medicine.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.alicia),"Alicia asked the pharmacist how to take the medicine. The pharmacist told her to take two pills twice a day.");
                    pages.add(tempPage);
                    break;
                case "Larisa":
                    nameView.setText("Larisa's story");

                    tempPage = new Page(getDrawable(R.drawable.larisa1),"Larisa's family eats too much meat and not enough fruits and vegetables.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.larisa2),"Their diet should include more fruits and vegetables, as shown in the picture.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.larisa3),"Good sources of fruit include apples, bananas, grapes, oranges, and strawberries.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.larisa4),"Good sources of vegetables include broccoli, carrots, peas, spinach, and string beans.");
                    pages.add(tempPage);
                    tempPage = new Page(getDrawable(R.drawable.larisa5),"Good sources of grains include brown rice, corn bread, pasta, and wheat bread.");
                    pages.add(tempPage);
                    break;
            }

            displayFirstPage();
        }
    }

    void displayFirstPage()
    {
        currentPage = 0;
        Page myPage = pages.get(currentPage);
        storyText.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }

    public void displayNextPage(View view)
    {
        if (currentPage < pages.size() -1)
            currentPage++;
        Page myPage = pages.get(currentPage);
        storyText.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }
    public void displayLastPage(View view)
    {
        if (currentPage > 0)
            currentPage--;
        Page myPage = pages.get(currentPage);
        storyText.setText(myPage.storyText);
        pictureView.setImageDrawable(myPage.pagePic);
    }


    class Page{

        public Drawable pagePic;
        public String storyText;
        public Page(Drawable _pagePic,String _storyText)
        {
            pagePic = _pagePic;
            storyText = _storyText;
        }
    }
}
