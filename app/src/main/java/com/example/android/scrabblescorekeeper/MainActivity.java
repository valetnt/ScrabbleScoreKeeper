package com.example.android.scrabblescorekeeper;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    int multiplier = 1;
    int globalMultiplier = 1;
    int playerScore1 = 0;
    int playerScore2 = 0;
    String newWord = "";
    int switcher = 0;

    static final String TEMP_SCORE = "temporary score";
    static final String SCORE_P1 = "score of player 1";
    static final String SCORE_P2 = "score of player 2";
    static final String MULTIPLIER = "letter multiplier";
    static final String GLOBAL_MULTIPLIER = "global multiplier";
    static final String WORD = "word";
    static final String SWITCHER = "letter multiplier states: off/x2/x3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            ((TextView) findViewById(R.id.tempScore)).setText(String.valueOf(savedInstanceState.getInt(TEMP_SCORE)));
            ((TextView) findViewById(R.id.player1_score)).setText(String.valueOf(savedInstanceState.getInt(SCORE_P1)));
            ((TextView) findViewById(R.id.player2_score)).setText(String.valueOf(savedInstanceState.getInt(SCORE_P2)));
            score = savedInstanceState.getInt(TEMP_SCORE);
            playerScore1 = savedInstanceState.getInt(SCORE_P1);
            playerScore2 = savedInstanceState.getInt(SCORE_P2);
            multiplier = savedInstanceState.getInt(MULTIPLIER);
            globalMultiplier = savedInstanceState.getInt(GLOBAL_MULTIPLIER);
            newWord = String.valueOf(savedInstanceState.getCharSequence(WORD));
            ((TextView) findViewById(R.id.word)).setText(newWord);
            switcher = savedInstanceState.getInt(SWITCHER);

        } else {
            ((TextView) findViewById(R.id.tempScore)).setText("0");
            ((TextView) findViewById(R.id.player1_score)).setText("0");
            ((TextView) findViewById(R.id.player2_score)).setText("0");
            ((TextView) findViewById(R.id.word)).setText("");
            switcher = 0;
        }

        TurnLayoutBrightOnOff(switcher);
        super.onCreate(savedInstanceState);
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt(TEMP_SCORE, score);
        savedInstanceState.putInt(MULTIPLIER, multiplier);
        savedInstanceState.putInt(GLOBAL_MULTIPLIER, globalMultiplier);
        savedInstanceState.putInt(SCORE_P1, playerScore1);
        savedInstanceState.putInt(SCORE_P2, playerScore2);
        savedInstanceState.putCharSequence(WORD, ((TextView) findViewById(R.id.word)).getText());
        savedInstanceState.putInt(SWITCHER, switcher);
        super.onSaveInstanceState(savedInstanceState);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        savedInstanceState.getInt(TEMP_SCORE, score);
        savedInstanceState.getInt(MULTIPLIER, multiplier);
        savedInstanceState.getInt(GLOBAL_MULTIPLIER, globalMultiplier);
        savedInstanceState.getInt(SCORE_P1, playerScore1);
        savedInstanceState.getInt(SCORE_P2, playerScore2);
        savedInstanceState.getCharSequence(WORD, ((TextView) findViewById(R.id.word)).getText());
        savedInstanceState.getInt(SWITCHER, switcher);
        TurnLayoutBrightOnOff(switcher);
        super.onSaveInstanceState(savedInstanceState);
    }

    public void LetterMultiplyBy2(View view) {
        multiplier = 2;
        switcher = 1;
        TurnLayoutBrightOnOff(1);
    }

    public void LetterMultiplyBy3(View view) {
        multiplier = 3;
        switcher = 2;
        TurnLayoutBrightOnOff(2);
    }

    public void WordMultiplyBy2(View view) {
        globalMultiplier = 2 * globalMultiplier;
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = "(x2) " + wordView.getText();
        wordView.setText(newWord);
    }

    public void WordMultiplyBy3(View view) {
        globalMultiplier = 3 * globalMultiplier;
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = "(x3) " + wordView.getText();
        wordView.setText(newWord);
    }

    public void DisplayTempScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tempScore);
        scoreView.setText(String.valueOf(score));
    }

    public void Add1(View view) {
        score = score + multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }

    public void Add2(View view) {
        score = score + 2 * multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }

    public void Add3(View view) {
        score = score + 3 * multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }

    public void Add4(View view) {
        score = score + 4 * multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }

    public void Add8(View view) {
        score = score + 8 * multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }

    public void Add10(View view) {
        score = score + 10 * multiplier;
        DisplayTempScore(score);
        multiplier = 1;
    }


    public void AddA(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "a";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddC(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "c";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddE(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "e";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddI(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "i";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddO(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "o";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddR(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "r";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddS(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "s";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddT(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "t";
        wordView.setText(newWord);
        Add1(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddL(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "l";
        wordView.setText(newWord);
        Add2(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddM(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "m";
        wordView.setText(newWord);
        Add2(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddN(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "n";
        wordView.setText(newWord);
        Add2(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddP(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "p";
        wordView.setText(newWord);
        Add3(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddB(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "b";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddD(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "d";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddF(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "f";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddG(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "g";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddU(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "u";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddV(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "v";
        wordView.setText(newWord);
        Add4(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddH(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "h";
        wordView.setText(newWord);
        Add8(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddZ(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "z";
        wordView.setText(newWord);
        Add8(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void AddQ(View view) {
        TextView wordView = (TextView) findViewById(R.id.word);
        newWord = wordView.getText() + "q";
        wordView.setText(newWord);
        Add10(view);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }


    public void Reset(View view) {
        score = 0;
        multiplier = 1;
        globalMultiplier = 1;
        TextView wordView = (TextView) findViewById(R.id.word);
        wordView.setText("");
        DisplayTempScore(score);
        switcher = 0;
        TurnLayoutBrightOnOff(0);
    }

    public void DisplayPlayer1Score(int finalScore) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        playerScore1 = playerScore1 + finalScore * globalMultiplier;
        scoreView.setText(String.valueOf(playerScore1));
    }

    public void DisplayPlayer2Score(int finalScore) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        playerScore2 = playerScore2 + finalScore * globalMultiplier;
        scoreView.setText(String.valueOf(playerScore2));
    }

    public void SelectPlayer1(View view) {
        DisplayPlayer1Score(score);
        Reset(view);
    }

    public void SelectPlayer2(View view) {
        DisplayPlayer2Score(score);
        Reset(view);
    }

    public void AddBonusToPlayer1(View view) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        playerScore1 += 10;
        scoreView.setText(String.valueOf(playerScore1));
    }

    public void AddBonusToPlayer2(View view) {
        TextView scoreView = (TextView) findViewById(R.id.player2_score);
        playerScore2 += 10;
        scoreView.setText(String.valueOf(playerScore2));
    }

    public void ResetAll(View view) {
        playerScore1 = 0;
        playerScore2 = 0;
        DisplayPlayer1Score(0);
        DisplayPlayer2Score(0);
        Reset(view);
    }


    private void TurnLayoutBrightOnOff(int switcher) {

        switch (switcher) {

            case 0:
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.firstKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorNormalButtonBack));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorNormalButtonText));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.secondKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorNormalButtonBack));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorNormalButtonText));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.thirdKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorNormalButtonBack));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorNormalButtonText));
                }
                break;


            case 1:
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.firstKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton2L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton2L));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.secondKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton2L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton2L));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.thirdKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton2L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton2L));
                }
                break;


            case 2:
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.firstKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton3L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton3L));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.secondKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton3L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton3L));
                }
                for (int index = 0; index < 7; ++index) {
                    Button nextChild = (Button) (((ViewGroup) (findViewById(R.id.thirdKeyboardRow))).getChildAt(index));
                    nextChild.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBackButton3L));
                    nextChild.setTextColor(ContextCompat.getColor(this, R.color.colorTextButton3L));
                }
                break;
        }
    }

}
