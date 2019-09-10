package com.example.myapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,vocabClass {

    // Variables
    TextView textView1;

    Button button1;

    Button button2;

    Button button3;

    Button button4;

    Button next;

    TextView scoreView;

    int numCorrect = 0;

    int numWrong = 0;

    int index = 0;

    int temp = 0;

    final int ARR_INDEX = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //setting MainActivity User Interface

        textView1 = findViewById(R.id.textView1);

        button1 = findViewById(R.id.button1);

        button2 = findViewById(R.id.button2);

        button3 = findViewById(R.id.button3);

        button4 = findViewById(R.id.button4);

        next = findViewById(R.id.nextButton);

        scoreView = findViewById(R.id.scoreView);

        textView1.setText("Welcome to the Git Gud Study Game, this of course is a game to help you understand words commonly used in Git. There are 4 buttons, 4 answers will pop up at each question if you click the correct one your correct score goes up, else your wrong score goes up. Hit Next to get a new defitition, There will be a score counter displayed at the top of the screen, you can see how many correct and how many incorrect you have gotten so far.");

        scoreView.setText("Correct: " + numCorrect + " Wrong: " + numWrong);

        button1.setText(Answer1[index]);

        button2.setText(Answer2[index]);

        button3.setText(Answer3[index]);

        button4.setText(Answer4[index]);

        next.setText("Next");

        button1.setOnClickListener(this);

        button2.setOnClickListener(this);

        button3.setOnClickListener(this);

        button4.setOnClickListener(this);

        next.setOnClickListener(this);

    }

//Method that controls what happens when buttons 1-4 + Next are clicked

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.button1)
        {
            if (button1.getText() == vocabArr[0])
            {
                launchCorrectActivity();
            }
            else
            {
                launchWrongActivity();
            }

        }
        else if (view.getId() == R.id.button2)
        {
            if (button2.getText() == vocabArr[0])
            {
                launchCorrectActivity();
            }
            else
            {
                launchWrongActivity();
            }

        }
        else if (view.getId() == R.id.button3)
        {
            if (button3.getText() == vocabArr[0])
            {
                launchCorrectActivity();
            }
            else
            {
                launchWrongActivity();
            }

        }
        else if (view.getId() == R.id.button4)
        {

            if (button4.getText() == vocabArr[0])
            {
                launchCorrectActivity();
            }
            else
            {
                launchWrongActivity();

            }

        }
        else
        {
            if(numCorrect+numWrong+1==15)
            {

                vocabArr[0] = lastVocab[0];
                textView1.setText(vocabClass.LastDef[0]);

            }
            else

           textView1.setText(getDefinition(0));

        }

    }


//Methods for switching activities

    private void launchCorrectActivity() {
// Intent to push variables over to correct activity

        Intent intentCorrect = new Intent(this,correctActivity.class);

        intentCorrect.putExtra("numCorrect",numCorrect);

        intentCorrect.putExtra("numWrong",numWrong);

        startActivityForResult(intentCorrect,1);
    }
    private void launchWrongActivity() {

        Intent intentWrong = new Intent(this,wrongActivity.class);

        intentWrong.putExtra("numCorrect",numCorrect);

        intentWrong.putExtra("numWrong",numWrong);

        startActivityForResult(intentWrong,2);

    }


// Getters
    @Override
    public String getDefinition(int i) {
        return vocabClass.Definitions[i];
    }

    @Override
    public String getVocab(int i) {
        return vocabClass.vocabArr[i];
    }

// Returning the changed data from correctActivity and wrongActivity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

            if (requestCode == 1)
            {
                if (resultCode == RESULT_OK)
                {
                    numCorrect = data.getIntExtra("numCorrect",0);

                    numWrong = data.getIntExtra("numWrong",0);

                    scoreView.setText("Correct: " + numCorrect + " Wrong: " + numWrong);

                    index++;

                    button1.setText(Answer1[index]);

                    button2.setText(Answer2[index]);

                    button3.setText(Answer3[index]);

                    button4.setText(Answer4[index]);
                }
            }
            else if (requestCode == 2)
            {
                if (resultCode == RESULT_OK)
                {
                    numCorrect = data.getIntExtra("numCorrect",0);

                    numWrong = data.getIntExtra("numWrong",0);

                    scoreView.setText("Correct: " + numCorrect + " Wrong: " + numWrong);

                    index++;

                    button1.setText(Answer1[index]);

                    button2.setText(Answer2[index]);

                    button3.setText(Answer3[index]);

                    button4.setText(Answer4[index]);


                }
            }
    }


}









