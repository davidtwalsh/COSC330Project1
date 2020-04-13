package com.davidwalsh.a330project1;

import android.app.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Stack;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.widget.Button;
import java.util.concurrent.ThreadLocalRandom;
import android.view.View;

public class VocabularyActivity extends Activity {

    TextView wordText;
    ImageView wordImage;
    Button choice1;
    Button choice2;
    Button choice3;

    Stack<Word> wordStack;
    ArrayList<String> defList;

    Word currentWord;

    int correctWords;
    int totalWords;
    boolean hasSelectedChoice;

    MediaPlayer correctSnd;
    MediaPlayer errorSnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        Bundle extras = getIntent().getExtras();
        if (extras != null)
        {
            int chapter = extras.getInt("chapter");

            /*
            Toast toast = Toast.makeText(getApplicationContext(),
                    String.valueOf(chapter),
                    Toast.LENGTH_SHORT);

            toast.show();
             */
            wordText = (TextView)findViewById(R.id.vocabWord);
            wordImage = (ImageView)findViewById(R.id.vocabPicture);
            choice1 = (Button)findViewById(R.id.vocabChoice1Btn);
            choice2 = (Button)findViewById(R.id.vocabChoice2Btn);
            choice3 = (Button)findViewById(R.id.vocabChoice3Btn);

            wordStack = new Stack<Word>();
            defList = new ArrayList<String>();

            correctSnd = MediaPlayer.create(this,R.raw.correct);
            errorSnd = MediaPlayer.create(this,R.raw.error);

            switch (chapter)
            {
                case 1:
                    Word tempWord = new Word("Appointment (uh-Point-ment)",getDrawable(R.drawable.appointment_pic),"A time to meet or agree to see someone");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Checkup (CHECK-up)",getDrawable(R.drawable.checkup_pic),"A visit to the doctor when you are not sick");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Copay (CO-paa)",getDrawable(R.drawable.checkup_pic),"When you pay a set fee when you visit a doctor and your health insurance pays the rest");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Emergency (ee-MER-gen-see)",getDrawable(R.drawable.emergency_pic),"When there is a serious problem and you need help right away");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Health Insurance (H-elth In-SHER-uns)",getDrawable(R.drawable.health_insurance_pic),"A program where you pay each month and the program pays for your health care");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Medical Interpreter (MED-uh-cal in-TERP-ret-er)",getDrawable(R.drawable.medical_interpreter_pic),"A person who is trained to translate information from doctor to patient and from patient to doctor");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Primary Care Center (Pri-Mar-EE Kare-Senter)",getDrawable(R.drawable.primary_care_center_pic),"The place you go for all your basic health care needs");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                break;

                case 2:
                    tempWord = new Word("Allergy (AL-ler-JEE)",getDrawable(R.drawable.allergy_pic),"Reaction to certain foods or other things. May cause rashes, hives, sneezing");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Fever (FEE-ver)",getDrawable(R.drawable.fever_pic),"When your body temperature is too high");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Headache (Hed-A-eek)",getDrawable(R.drawable.headache_pic),"Pain or ache in your head");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Health History (Helth HISS-tor-EE)",getDrawable(R.drawable.health_history_pic),"The health problems you had in the past");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Sore Throat (SOR th-ROT)",getDrawable(R.drawable.sore_throat_pic),"When your throat hurts, it is hard to swallow");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Symptoms (SIMP-tums)",getDrawable(R.drawable.symptoms_pic),"Something that happens with the body that shows you have injury or illness");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);


                    break;
                case 3:
                    tempWord = new Word("Generic Medicine (Gen-AIR-ik)",getDrawable(R.drawable.generic_medicine_pic),"Not a name brand; less expensive than name brand");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Label (LA-bel)",getDrawable(R.drawable.label_pic),"On the bottle/box to describe the medicine and how to take it");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Over-the-counter (O-ver the COUNT-er)",getDrawable(R.drawable.otc_pic),"Medicine you can buy at store without a prescription");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Pharmacy (FARM-uh-see)",getDrawable(R.drawable.pharmacy_pic),"Where you go to buy medicine");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Pharmacist (FARM-us-sist)",getDrawable(R.drawable.pharmacist_pic),"A person who fills prescriptions at the pharmacy");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Prescription(RX) (Pre-SCRIP-shun)",getDrawable(R.drawable.prescription_pic),"You need one of these from a doctor for some medications");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);

                    tempWord = new Word("Side effect (SIDE e-fekt)",getDrawable(R.drawable.side_effect_pic),"An unwanted result or symptom from a medication");
                    wordStack.push(tempWord);
                    defList.add(tempWord.definition);
                    break;

                    case 4:
                        tempWord = new Word("Fiber (FI-bur)",getDrawable(R.drawable.fiber_pic),"Foods that help you feel full and help stool come out");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        tempWord = new Word("Nutrition (New-TREE-ent)",getDrawable(R.drawable.nutrition_pic),"How the body uses food to stay healthy");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        tempWord = new Word("Obesity (oh-BEE-sit-ee)",getDrawable(R.drawable.obesity_pic),"A weight that is dangerous to your health; being overweight");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        tempWord = new Word("Recipe (Re-si-PEE)",getDrawable(R.drawable.recipe_pic),"List of what goes into a meal and how to prepare it");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        tempWord = new Word("Sodium (SO-dee-um)",getDrawable(R.drawable.sodium_pic),"Another word for salt");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        tempWord = new Word("Vitamins (VI-ta-mins)",getDrawable(R.drawable.vitamins_pic),"A kind of nutrient in foods that help fight sickness and keeps the body healthy");
                        wordStack.push(tempWord);
                        defList.add(tempWord.definition);

                        break;
            }

            totalWords = wordStack.size();
            correctWords = 0;

            setUpNewWord();
        }
    }

    void setUpNewWord()
    {
        if (wordStack.size() == 0)
        {
            onWordsCompleted();
            return;
        }

        currentWord = wordStack.pop();
        hasSelectedChoice = false;

        wordText.setText(currentWord.word);
        wordImage.setImageDrawable(currentWord.drawable);
        int r = getRandomInt(1,3);

        String secondChoice = "";
        for (int i =1; i <= 3; i++)
        {
            if (i == r)//right answer
            {
                if (r == 1)
                    choice1.setText(currentWord.definition);
                else if (r==2)
                    choice2.setText(currentWord.definition);
                else if (r==3)
                    choice3.setText(currentWord.definition);
            }
            else
            {

                int randomIndex = getRandomInt(0,defList.size()-1);
                while (defList.get(randomIndex).contentEquals(currentWord.definition) || defList.get(randomIndex).contentEquals(secondChoice))
                {
                    randomIndex = getRandomInt(0,defList.size()-1);
                }
                secondChoice = defList.get(randomIndex);
                if (i == 1)
                    choice1.setText(defList.get(randomIndex));
                else if (i==2)
                    choice2.setText(defList.get(randomIndex));
                else if (i==3)
                    choice3.setText(defList.get(randomIndex));



            }
        }
    }

    void onWordsCompleted()
    {
        Toast toast = Toast.makeText(getApplicationContext(),
                "You got " + String.valueOf(correctWords) + " out of " + String.valueOf(totalWords) + " on the first try",
                Toast.LENGTH_SHORT);

        toast.show();
    }

    public void userSelectsChoice(View view)
    {
        Button selectedButton = (Button)view;
        if (selectedButton.getText() == currentWord.definition) //user selects correct choice
        {
            correctSnd.start();
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Correct Answer",
                    Toast.LENGTH_SHORT);

            toast.show();

            if (hasSelectedChoice == false)
                correctWords++;
            setUpNewWord();
        }
        else //user selects wrong choice
        {
            errorSnd.start();
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Incorrect, Try Again",
                    Toast.LENGTH_SHORT);

            toast.show();
            hasSelectedChoice = true;
        }
    }

    public int getRandomInt(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    class Word
    {
        public String word;
        public Drawable drawable;
        public String definition;

        public Word(String _word, Drawable _drawable, String _definition)
        {
            word = _word;
            drawable = _drawable;
            definition = _definition;
        }
    }
}
