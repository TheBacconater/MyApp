package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class correctActivity extends AppCompatActivity implements View.OnClickListener,vocabClass {

// Variables
    Button correctButton1;

    TextView correctTextView1;

    TextView counterView;

    int numCorrect;

    int numWrong;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct);

        Intent intent = getIntent();

        numCorrect = intent.getIntExtra("numCorrect",numCorrect);

        numWrong = intent.getIntExtra("numWrong",numWrong);

        correctButton1 = findViewById(R.id.correctButton1);

        correctTextView1 = findViewById(R.id.correctView1);

        counterView = findViewById(R.id.counterView);

        counterView.setText("Correct: " + numCorrect + " Wrong: " + numWrong);

        correctTextView1.setText("Congrats! the answer you guessed was correct it was: " + getVocab(0));

        correctButton1.setText("Go Back");

        correctButton1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        // deleting the def and vocab word of the first index of the array

        String[] newArr = new String[vocabArr.length-1];

        String[] newArr2 = new String[Definitions.length-1];

        for (int i = 1; i < vocabArr.length-1; i++)
        {

            newArr[i-1] = vocabClass.vocabArr[i];

            newArr2[i-1] = vocabClass.Definitions[i];


        }
        for (int i = 0; i < vocabArr.length-1; i++)
        {
            vocabClass.vocabArr[i] = newArr[i];

            vocabClass.Definitions[i] = newArr2[i];
        }

        Intent resultIntent = new Intent();

        numCorrect++;

        resultIntent.putExtra("numCorrect",numCorrect);

        resultIntent.putExtra("numWrong",numWrong);

        setResult(RESULT_OK,resultIntent);

        if (numCorrect+numWrong+1==16)
        {

            Intent intentCorrect = new Intent(this,finalResults.class);

            intentCorrect.putExtra("numCorrect",numCorrect);

            intentCorrect.putExtra("numWrong",numWrong);

            startActivityForResult(intentCorrect,1);

        }
    else
        {
            finish();
        }
    }


    @Override
    public String getDefinition(int x) {
        return vocabClass.Definitions[x];
    }

    @Override
    public String getVocab(int x) {
        return vocabClass.vocabArr[x];
    }
}
