package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class wrongActivity extends AppCompatActivity implements View.OnClickListener,vocabClass {

    // Variables

    Button wrongButton1;

    TextView wrongTextView1;

    TextView counterView;

    int numCorrect;

    int numWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

    // Setting wrongActivity User Interface

        Intent intent = getIntent();

        wrongButton1 = findViewById(R.id.buttonBack);

        wrongTextView1 = findViewById(R.id.wrongView);

        counterView = findViewById(R.id.scoreCount);

        numWrong = intent.getIntExtra("numWrong",numWrong);

        numCorrect = intent.getIntExtra("numCorrect",numCorrect);

        counterView.setText("Correct: " + numCorrect + " Wrong: " + numWrong);

        wrongTextView1.setText("OOPS the answer was: " + getVocab(0));

        wrongButton1.setText("Go Back");

        wrongButton1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

// Decreasing array of vocab and definition on button click.

        if(view.getId() == R.id.buttonBack)
        {

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

//returning numCorrect and numWrong through an intent and if numCorrect+numWrong = 16 go to finalResults

            Intent resultIntent2 = new Intent();

            numWrong++;

            resultIntent2.putExtra("numWrong",numWrong);

            resultIntent2.putExtra("numCorrect",numCorrect);

            setResult(RESULT_OK,resultIntent2);

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

