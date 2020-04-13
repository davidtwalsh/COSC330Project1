package com.davidwalsh.a330project1;

import android.app.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.media.MediaPlayer;

public class WordSearch extends Activity {

    ButtonStruct[][] buttons;
    boolean hasStarted;
    int currentX;
    int currentY;

    TextView showFoundWord;
    TextView wordToFind1;
    TextView wordToFind2;
    TextView wordToFind3;
    TextView wordToFind4;
    TextView wordToFind5;
    TextView wordToFind6;
    TextView wordToFind7;
    TextView wordToFind8;
    TextView wordToFind9;

    MediaPlayer popSnd;
    MediaPlayer scoreSnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_search);

        popSnd = MediaPlayer.create(this,R.raw.pop);
        scoreSnd = MediaPlayer.create(this,R.raw.correct);

        showFoundWord = findViewById(R.id.showFoundWord);
        wordToFind1 = findViewById(R.id.wordToFind1);
        wordToFind2 = findViewById(R.id.wordToFind2);
        wordToFind3 = findViewById(R.id.wordToFind3);
        wordToFind4 = findViewById(R.id.wordToFind4);
        wordToFind5 = findViewById(R.id.wordToFind5);
        wordToFind6 = findViewById(R.id.wordToFind6);
        wordToFind7 = findViewById(R.id.wordToFind7);
        wordToFind8 = findViewById(R.id.wordToFind8);
        wordToFind9 = findViewById(R.id.wordToFind9);

        hasStarted = false;
        buttons = new ButtonStruct[8][9];

        buttons[0][0] = new ButtonStruct((Button)findViewById(R.id.but00),0,0);
        buttons[0][1] = new ButtonStruct((Button)findViewById(R.id.but01),0,1);
        buttons[0][2] = new ButtonStruct((Button)findViewById(R.id.but02),0,2);
        buttons[0][3] = new ButtonStruct((Button)findViewById(R.id.but03),0,3);
        buttons[0][4] = new ButtonStruct((Button)findViewById(R.id.but04),0,4);
        buttons[0][5] = new ButtonStruct((Button)findViewById(R.id.but05),0,5);
        buttons[0][6] = new ButtonStruct((Button)findViewById(R.id.but06),0,6);
        buttons[0][7] = new ButtonStruct((Button)findViewById(R.id.but07),0,7);
        buttons[0][8] = new ButtonStruct((Button)findViewById(R.id.but08),0,8);

        buttons[1][0] = new ButtonStruct((Button)findViewById(R.id.but10),1,0);
        buttons[1][1] = new ButtonStruct((Button)findViewById(R.id.but11),1,1);
        buttons[1][2] = new ButtonStruct((Button)findViewById(R.id.but12),1,2);
        buttons[1][3] = new ButtonStruct((Button)findViewById(R.id.but13),1,3);
        buttons[1][4] = new ButtonStruct((Button)findViewById(R.id.but14),1,4);
        buttons[1][5] = new ButtonStruct((Button)findViewById(R.id.but15),1,5);
        buttons[1][6] = new ButtonStruct((Button)findViewById(R.id.but16),1,6);
        buttons[1][7] = new ButtonStruct((Button)findViewById(R.id.but17),1,7);
        buttons[1][8] = new ButtonStruct((Button)findViewById(R.id.but18),1,8);

        buttons[2][0] = new ButtonStruct((Button)findViewById(R.id.but20),2,0);
        buttons[2][1] = new ButtonStruct((Button)findViewById(R.id.but21),2,1);
        buttons[2][2] = new ButtonStruct((Button)findViewById(R.id.but22),2,2);
        buttons[2][3] = new ButtonStruct((Button)findViewById(R.id.but23),2,3);
        buttons[2][4] = new ButtonStruct((Button)findViewById(R.id.but24),2,4);
        buttons[2][5] = new ButtonStruct((Button)findViewById(R.id.but25),2,5);
        buttons[2][6] = new ButtonStruct((Button)findViewById(R.id.but26),2,6);
        buttons[2][7] = new ButtonStruct((Button)findViewById(R.id.but27),2,7);
        buttons[2][8] = new ButtonStruct((Button)findViewById(R.id.but28),2,8);

        buttons[3][0] = new ButtonStruct((Button)findViewById(R.id.but30),3,0);
        buttons[3][1] = new ButtonStruct((Button)findViewById(R.id.but31),3,1);
        buttons[3][2] = new ButtonStruct((Button)findViewById(R.id.but32),3,2);
        buttons[3][3] = new ButtonStruct((Button)findViewById(R.id.but33),3,3);
        buttons[3][4] = new ButtonStruct((Button)findViewById(R.id.but34),3,4);
        buttons[3][5] = new ButtonStruct((Button)findViewById(R.id.but35),3,5);
        buttons[3][6] = new ButtonStruct((Button)findViewById(R.id.but36),3,6);
        buttons[3][7] = new ButtonStruct((Button)findViewById(R.id.but37),3,7);
        buttons[3][8] = new ButtonStruct((Button)findViewById(R.id.but38),3,8);

        buttons[4][0] = new ButtonStruct((Button)findViewById(R.id.but40),4,0);
        buttons[4][1] = new ButtonStruct((Button)findViewById(R.id.but41),4,1);
        buttons[4][2] = new ButtonStruct((Button)findViewById(R.id.but42),4,2);
        buttons[4][3] = new ButtonStruct((Button)findViewById(R.id.but43),4,3);
        buttons[4][4] = new ButtonStruct((Button)findViewById(R.id.but44),4,4);
        buttons[4][5] = new ButtonStruct((Button)findViewById(R.id.but45),4,5);
        buttons[4][6] = new ButtonStruct((Button)findViewById(R.id.but46),4,6);
        buttons[4][7] = new ButtonStruct((Button)findViewById(R.id.but47),4,7);
        buttons[4][8] = new ButtonStruct((Button)findViewById(R.id.but48),4,8);

        buttons[5][0] = new ButtonStruct((Button)findViewById(R.id.but50),5,0);
        buttons[5][1] = new ButtonStruct((Button)findViewById(R.id.but51),5,1);
        buttons[5][2] = new ButtonStruct((Button)findViewById(R.id.but52),5,2);
        buttons[5][3] = new ButtonStruct((Button)findViewById(R.id.but53),5,3);
        buttons[5][4] = new ButtonStruct((Button)findViewById(R.id.but54),5,4);
        buttons[5][5] = new ButtonStruct((Button)findViewById(R.id.but55),5,5);
        buttons[5][6] = new ButtonStruct((Button)findViewById(R.id.but56),5,6);
        buttons[5][7] = new ButtonStruct((Button)findViewById(R.id.but57),5,7);
        buttons[5][8] = new ButtonStruct((Button)findViewById(R.id.but58),5,8);

        buttons[6][0] = new ButtonStruct((Button)findViewById(R.id.but60),6,0);
        buttons[6][1] = new ButtonStruct((Button)findViewById(R.id.but61),6,1);
        buttons[6][2] = new ButtonStruct((Button)findViewById(R.id.but62),6,2);
        buttons[6][3] = new ButtonStruct((Button)findViewById(R.id.but63),6,3);
        buttons[6][4] = new ButtonStruct((Button)findViewById(R.id.but64),6,4);
        buttons[6][5] = new ButtonStruct((Button)findViewById(R.id.but65),6,5);
        buttons[6][6] = new ButtonStruct((Button)findViewById(R.id.but66),6,6);
        buttons[6][7] = new ButtonStruct((Button)findViewById(R.id.but67),6,7);
        buttons[6][8] = new ButtonStruct((Button)findViewById(R.id.but68),6,8);

        buttons[7][0] = new ButtonStruct((Button)findViewById(R.id.but70),7,0);
        buttons[7][1] = new ButtonStruct((Button)findViewById(R.id.but71),7,1);
        buttons[7][2] = new ButtonStruct((Button)findViewById(R.id.but72),7,2);
        buttons[7][3] = new ButtonStruct((Button)findViewById(R.id.but73),7,3);
        buttons[7][4] = new ButtonStruct((Button)findViewById(R.id.but74),7,4);
        buttons[7][5] = new ButtonStruct((Button)findViewById(R.id.but75),7,5);
        buttons[7][6] = new ButtonStruct((Button)findViewById(R.id.but76),7,6);
        buttons[7][7] = new ButtonStruct((Button)findViewById(R.id.but77),7,7);
        buttons[7][8] = new ButtonStruct((Button)findViewById(R.id.but78),7,8);

    }

    public void selectedButton(View view)
    {
        popSnd.start();

        Button buttonSelected = (Button)view;
        //buttonSelected.setTextColor(getResources().getColor(R.color.colorAccent));
        if (hasStarted == false) //1ST SELECTION
        {
            ButtonStruct b = findButtonStructFromButton(buttonSelected);
            currentX = b.xPos;
            currentY = b.yPos;
            buttonSelected.setTextColor(getResources().getColor(R.color.colorAccent));
            b.isSelected = true;
            hasStarted = true;
        }
        else //GAME BEGAN
        {
            ButtonStruct b = findButtonStructFromButton(buttonSelected);

            //ADJACENT SELECTIONS
            if ((b.xPos == currentX+1 && b.yPos == currentY)|| (b.xPos == currentX-1 && b.yPos == currentY)||(b.xPos==currentX && b.yPos == currentY-1)||(b.xPos==currentX && b.yPos == currentY+1))
            {
                currentX = b.xPos;
                currentY = b.yPos;
                buttonSelected.setTextColor(getResources().getColor(R.color.colorAccent));
                b.isSelected = true;
            }
            //NONADJACENT SELECTIONS
            else
            {
                clearSelections();
                currentX = b.xPos;
                currentY = b.yPos;
                buttonSelected.setTextColor(getResources().getColor(R.color.colorAccent));
                b.isSelected = true;
            }
        }

        checkSelections();
    }

    void checkSelections()
    {
        //wordToFind1 ->medicine
        if (buttons[0][0].isSelected == true && buttons[0][1].isSelected == true && buttons[0][2].isSelected == true && buttons[0][3].isSelected == true && buttons[0][4].isSelected == true && buttons[0][5].isSelected == true && buttons[0][6].isSelected == true && buttons[0][7].isSelected == true)
        {
            wordToFind1.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Medicine Found!");
            scoreSnd.start();
        }

        //wordToFind2 ->breath
        if (buttons[5][2].isSelected == true && buttons[5][3].isSelected == true && buttons[5][4].isSelected == true && buttons[5][5].isSelected == true && buttons[5][6].isSelected == true && buttons[5][7].isSelected == true && buttons[5][8].isSelected == true)
        {
            wordToFind2.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Breathe Found!");
            scoreSnd.start();
        }
        //wordToFind3 ->checkup
        if (buttons[1][0].isSelected == true && buttons[1][1].isSelected == true && buttons[1][2].isSelected == true && buttons[1][3].isSelected == true && buttons[1][4].isSelected == true && buttons[1][5].isSelected == true && buttons[1][6].isSelected == true)
        {
            wordToFind3.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Checkup Found!");
            scoreSnd.start();
        }
        //wordToFind4 ->copay
        if (buttons[1][0].isSelected == true && buttons[2][0].isSelected == true && buttons[3][0].isSelected == true && buttons[4][0].isSelected == true && buttons[5][0].isSelected == true)
        {
            wordToFind4.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Copay Found!");
            scoreSnd.start();
        }
        //wordToFind5 ->cough
        if (buttons[0][8].isSelected == true && buttons[1][8].isSelected == true && buttons[2][8].isSelected == true && buttons[3][8].isSelected == true && buttons[4][8].isSelected == true)
        {
            wordToFind5.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Cough Found!");
            scoreSnd.start();
        }

        //wordToFind6 ->emergency
        if (buttons[7][0].isSelected == true && buttons[7][1].isSelected == true && buttons[7][2].isSelected == true && buttons[7][3].isSelected == true && buttons[7][4].isSelected == true && buttons[7][5].isSelected == true && buttons[7][6].isSelected == true && buttons[7][7].isSelected == true&& buttons[7][8].isSelected == true)
        {
            wordToFind6.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Emergency Found!");
            scoreSnd.start();
        }

        //wordToFind7 ->insurance
        if (buttons[6][0].isSelected == true && buttons[6][1].isSelected == true && buttons[6][2].isSelected == true && buttons[6][3].isSelected == true && buttons[6][4].isSelected == true && buttons[6][5].isSelected == true && buttons[6][6].isSelected == true && buttons[6][7].isSelected == true&& buttons[6][8].isSelected == true)
        {
            wordToFind7.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Insurance Found!");
            scoreSnd.start();
        }
        //wordToFind8 ->fiber
        if (buttons[2][3].isSelected == true && buttons[2][4].isSelected == true && buttons[2][5].isSelected == true && buttons[2][6].isSelected == true && buttons[2][7].isSelected == true)
        {
            wordToFind8.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Fiber Found!");
            scoreSnd.start();
        }

        //wordToFind9 ->patient
        if (buttons[3][0].isSelected == true && buttons[3][1].isSelected == true && buttons[3][2].isSelected == true && buttons[3][3].isSelected == true && buttons[3][4].isSelected == true && buttons[3][5].isSelected == true && buttons[3][6].isSelected == true)
        {
            wordToFind9.setTextColor(getResources().getColor(R.color.colorGreen));
            showFoundWord.setText("Patient Found!");
            scoreSnd.start();
        }

    }

    void clearSelections()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                buttons[i][j].isSelected = false;
                buttons[i][j].button.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            }
        }
    }

    ButtonStruct findButtonStructFromButton(Button b)
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (b == buttons[i][j].button)
                {
                    return buttons[i][j];
                }
            }
        }
        return null;
    }

    class ButtonStruct
    {
        public Button button;
        public int xPos;
        public int yPos;
        boolean isSelected;

        public ButtonStruct(Button _button, int _xPos, int _yPos)
        {
            button = _button;
            xPos = _xPos;
            yPos = _yPos;
            isSelected = false;
        }
    }
}
