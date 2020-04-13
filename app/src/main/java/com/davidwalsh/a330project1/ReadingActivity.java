package com.davidwalsh.a330project1;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class ReadingActivity extends Activity {

    String beginning;
    String word;
    String end;
    String full;

    TextView title;
    TextView text;
    Button button;

    int exercise;
    int exCounter;
    boolean hasRevealed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);

        title = findViewById(R.id.rd_title);
        text = findViewById(R.id.rd_text);
        button = findViewById(R.id.rd_btn);

        hasRevealed = false;
        exCounter = 1;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            exercise = extras.getInt("exercise");

            switch (exercise) {
                case 1:

                    beginning = "When you are well, see your doctor for a ";
                    word = "_______. ";
                    end = "Your doctor will look for problems you do not see or feel. Finding a health problem may save your life.";
                    full = beginning + word + end;
                    text.setText(full);
                    title.setText("Where do I go for health care?");
                    break;
                case 2:
                    beginning = "Before visiting a doctor you should know your ";
                    word = "__________. ";
                    end = "These are things that happen in the body that shows you are sick.";
                    full = beginning + word + end;
                    text.setText(full);
                    title.setText("What will the doctor ask me?");
                    break;
                case 3:
                    beginning = "Healthy eating means the body is getting the food it needs to stay healthy. Healthy eating can prevent ";
                    word = "__________ ";
                    end = " and other health problems.";
                    full = beginning + word + end;
                    text.setText(full);
                    title.setText("What is Healthy Eating?");
                    break;

            }
        }
    }

    public void buttonPressed(View view)
    {
        if (hasRevealed == false)
        {
            if (exercise == 1)
            {
                if (exCounter == 1)
                {
                    word = "CHECKUP. ";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 2)
                {
                    word = "APPOINTMENT. ";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 3)
                {
                    word = "EMERGENCY, ";
                    setText();
                    deleteButton();
                }
            }
            else if (exercise == 2)
            {
                if (exCounter == 1)
                {
                    word = "SYMPTOMS. ";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 2)
                {
                    word = "MEDICATIONS ";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 3)
                {
                    word = "HEALTH HISTORY?";
                    setText();
                    deleteButton();
                }
            }
            else if (exercise == 3)
            {
                if (exCounter == 1)
                {
                    word = "DIABETES. ";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 2)
                {
                    word = "1)Fruits, 2)Vegetables, 3)Grains, 4)Protein Foods, and 5)Dairy";
                    setText();
                    setButtonToNext();
                }
                if (exCounter == 3)
                {
                    word = "FIBER and VITAMINS your body needs to stay healthy.";
                    setText();
                    deleteButton();
                }
            }
        }
        else
        {
            if (exercise == 1)
            {
                if (exCounter == 1)
                {
                    setUpNewText("When you are sick, go to your primary care center. Call your primary care center to make an ","_____________.","");
                }
                if (exCounter == 2)
                {
                    setUpNewText("When you have an ","_____________, ","go to a hospital or call 911. This is when you have a serious medical problem that must be addressed right away.");
                }
            }
            else if (exercise == 2)
            {
                if (exCounter == 1)
                {
                    setUpNewText("What ","___________ ","do you take? Before visiting a doctor write down the names of these and how much you take. Bring this list with you to the doctor.");
                }
                if (exCounter == 2)
                {
                    setUpNewText("What is your ","______________?"," This is the list of your past health problems. You should know this when visiting a doctor.");
                }
            }
            else if (exercise == 3)
            {
                if (exCounter == 1)
                {
                    setUpNewText("To stay healthy you need to eat foods from the five food groups. These five food groups are ","1)______, 2)__________, 3)_______, 4)______ _____, and 5)_____.","");
                }
                if (exCounter == 2)
                {
                    setUpNewText("One of the best things you can do for your health is eat more fruits and vegetables. Fruits and vegetables give you the ","_____ and ________ your body needs to stay healthy.","");
                }
            }
            setButtonToReveal();
        }
    }
    void setText()
    {
        full = beginning+word+end;
        text.setText(full);
    }
    void setButtonToNext()
    {
        button.setText("Next");
        hasRevealed = true;
    }
    void setButtonToReveal()
    {
        button.setText("Reveal Answer");
        hasRevealed = false;
        exCounter++;
    }
    void setUpNewText(String s1, String s2, String s3)
    {
        beginning = s1;
        word = s2;
        end = s3;
        setText();
    }
    void deleteButton()
    {
        button.setVisibility(View.INVISIBLE);
    }
}
