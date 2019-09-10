package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finalResults extends AppCompatActivity implements View.OnClickListener {

    TextView finalResults;

    TextView congratsView;

    Button finalButton;

    int numCorrect = 0;

    int numWrong = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_results);

    Intent intent = getIntent();

        numCorrect = intent.getIntExtra("numCorrect",numCorrect);

        numWrong = intent.getIntExtra("numWrong",numWrong);

        finalResults = findViewById(R.id.finalScore1);

        finalButton = findViewById(R.id.congratsButton);

        finalButton.setText("Go Back");

        finalResults.setText("Here are the results");

        congratsView = findViewById(R.id.congratsView);

        congratsView.setText("Final Score: Correct: "+ numCorrect + " Wrong: " + numWrong + "\n" + "THANKS FOR PLAYING!");

        finalButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

       Intent intent = new Intent(this,MainActivity.class);

       startActivity(intent);
    }
}
