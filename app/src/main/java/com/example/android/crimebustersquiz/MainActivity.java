package com.example.android.crimebustersquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Setting initial value of the quiz score variable
    int quiz_score = 0;

    //quiz answers & user input
    CheckBox q1ammonia_checkbox;
    CheckBox q1ho_checkbox;
    CheckBox q1vinegar_checkbox;
    CheckBox q1alcohol_checkbox;
    CheckBox q2ammonia_checkbox;
    CheckBox q2ho_checkbox;
    CheckBox q2vinegar_checkbox;
    CheckBox q2alcohol_checkbox;
    CheckBox q3ammonia_checkbox;
    CheckBox q3ho_checkbox;
    CheckBox q3vinegar_checkbox;
    CheckBox q3lemon_checkbox;


//submit answers
    public void submitAnswers (View v){
 //indicate which answer is selected
        //Score question 1
     q1ammonia_checkbox = (CheckBox)findViewById(R.id.q1ammonia_checkbox);
     boolean q1ammonia = q1ammonia_checkbox.isChecked();

     q1ho_checkbox = (CheckBox)findViewById(R.id.q1ho_checkbox);
     boolean q1ho = q1ho_checkbox.isChecked();

     q1vinegar_checkbox = (CheckBox)findViewById(R.id.q1vinegar_checkbox);
     boolean q1vinegar = q1vinegar_checkbox.isChecked();

     q1alcohol_checkbox = (CheckBox)findViewById(R.id.q1alcohol_checkbox);
     boolean q1alcohol = q1alcohol_checkbox.isChecked();

     if (q1ho && !q1alcohol && !q1ammonia && !q1vinegar)
         quiz_score = quiz_score + 1;

        //Score question 2
        q2ammonia_checkbox = (CheckBox)findViewById(R.id.q2ammonia_checkbox);
        boolean q2ammonia = q2ammonia_checkbox.isChecked();

        q2ho_checkbox = (CheckBox)findViewById(R.id.q2ho_checkbox);
        boolean q2ho = q2ho_checkbox.isChecked();

        q2vinegar_checkbox = (CheckBox)findViewById(R.id.q2vinegar_checkbox);
        boolean q2vinegar = q2vinegar_checkbox.isChecked();

        q2alcohol_checkbox = (CheckBox)findViewById(R.id.q2alcohol_checkbox);
        boolean q2alcohol = q2alcohol_checkbox.isChecked();

     if (q2ammonia && !q2ho && !q2alcohol && !q2vinegar)
         quiz_score = quiz_score + 1;

        //Score question 3
        q3ammonia_checkbox = (CheckBox)findViewById(R.id.q3ammonia_checkbox);
        boolean q3ammonia = q3ammonia_checkbox.isChecked();

        q3ho_checkbox = (CheckBox)findViewById(R.id.q3ho_checkbox);
        boolean q3ho = q3ho_checkbox.isChecked();

        q3vinegar_checkbox = (CheckBox)findViewById(R.id.q3vinegar_checkbox);
        boolean q3vinegar = q3vinegar_checkbox.isChecked();

        q3lemon_checkbox = (CheckBox)findViewById(R.id.q3lemon_checkbox);
        boolean q3lemon = q3lemon_checkbox.isChecked();

        if (q3ho && !q3lemon && !q3ammonia && !q3vinegar)
            quiz_score = quiz_score + 1;


        Toast.makeText(getApplicationContext(),getString(R.string.you_answered) + quiz_score + getString(R.string.correct), Toast.LENGTH_LONG).show();
    }

}
