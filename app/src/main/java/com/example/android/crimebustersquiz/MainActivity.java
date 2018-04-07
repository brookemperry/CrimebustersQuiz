package com.example.android.crimebustersquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



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
    EditText q4whorlEditText;
    EditText q5archEditText;
    EditText q6loopEditText;
    RadioButton q7yes_radiobutton;
    RadioButton q7no_radiobutton;
    RadioButton q8yes_radiobutton;
    RadioButton q8no_radiobutton;


//submit answers indicate which answer is selected
    public int submitAnswers (View v){


     q1ammonia_checkbox = (CheckBox)findViewById(R.id.q1ammonia_checkbox);
     boolean q1ammonia = q1ammonia_checkbox.isChecked();

     q1ho_checkbox = (CheckBox)findViewById(R.id.q1ho_checkbox);
     boolean q1ho = q1ho_checkbox.isChecked();

     q1vinegar_checkbox = (CheckBox)findViewById(R.id.q1vinegar_checkbox);
     boolean q1vinegar = q1vinegar_checkbox.isChecked();

     q1alcohol_checkbox = (CheckBox)findViewById(R.id.q1alcohol_checkbox);
     boolean q1alcohol = q1alcohol_checkbox.isChecked();


        q2ammonia_checkbox = (CheckBox)findViewById(R.id.q2ammonia_checkbox);
        boolean q2ammonia = q2ammonia_checkbox.isChecked();

        q2ho_checkbox = (CheckBox)findViewById(R.id.q2ho_checkbox);
        boolean q2ho = q2ho_checkbox.isChecked();

        q2vinegar_checkbox = (CheckBox)findViewById(R.id.q2vinegar_checkbox);
        boolean q2vinegar = q2vinegar_checkbox.isChecked();

        q2alcohol_checkbox = (CheckBox)findViewById(R.id.q2alcohol_checkbox);
        boolean q2alcohol = q2alcohol_checkbox.isChecked();


        q3ammonia_checkbox = (CheckBox)findViewById(R.id.q3ammonia_checkbox);
        boolean q3ammonia = q3ammonia_checkbox.isChecked();

        q3ho_checkbox = (CheckBox)findViewById(R.id.q3ho_checkbox);
        boolean q3ho = q3ho_checkbox.isChecked();

        q3vinegar_checkbox = (CheckBox)findViewById(R.id.q3vinegar_checkbox);
        boolean q3vinegar = q3vinegar_checkbox.isChecked();
        q3lemon_checkbox = (CheckBox)findViewById(R.id.q3lemon_checkbox);
        boolean q3lemon = q3lemon_checkbox.isChecked();

        q4whorlEditText = (EditText)findViewById(R.id.q4whorlEditText);
        String q4whorl = q4whorlEditText.getText().toString();

        q5archEditText = (EditText)findViewById(R.id.q5archEditText);
        String q5arch = q5archEditText.getText().toString();

        q6loopEditText = (EditText)findViewById(R.id.q6loopEditText);
        String q6loop = q6loopEditText.getText().toString();

        q7yes_radiobutton = (RadioButton)findViewById(R.id.q7yes_radiobutton);
        boolean q7yes = q7yes_radiobutton.isChecked();

        q7no_radiobutton = (RadioButton)findViewById(R.id.q7no_radiobutton);
        boolean q7no = q7no_radiobutton.isChecked();

        q8yes_radiobutton = (RadioButton)findViewById(R.id.q8yes_radiobutton);
        boolean q8yes = q8yes_radiobutton.isChecked();

        q8no_radiobutton = (RadioButton)findViewById(R.id.q8no_radiobutton);
        boolean q8no = q8no_radiobutton.isChecked();


        int final_score =  calculateScore(q1ammonia, q1ho, q1vinegar, q1alcohol, q2ammonia, q2ho, q2vinegar, q2alcohol,
         q3ho, q3lemon, q3ammonia, q3vinegar, q4whorl, q5arch, q6loop, q7no, q8yes);

        if (final_score == 8) {

            Toast.makeText(getApplicationContext(), getString(R.string.Crimebuster) + final_score + getString(R.string.correct), Toast.LENGTH_LONG).show();

        }

        if (final_score <= 7 && final_score >= 6) {

            Toast.makeText(getApplicationContext(), getString(R.string.almost) + final_score + getString(R.string.try_again), Toast.LENGTH_LONG).show();

        }

        if (final_score <= 5) {

            Toast.makeText(getApplicationContext(), getString(R.string.go_back) + final_score + getString(R.string.out_of_8), Toast.LENGTH_LONG).show();

        }
        return final_score;
    }

// Calculate score

    public int calculateScore (boolean q1ammonia, boolean q1ho, boolean q1vinegar, boolean q1alcohol,
                               boolean q2ammonia,boolean q2ho, boolean q2vinegar, boolean q2alcohol,
                               boolean q3ho, boolean q3lemon, boolean q3ammonia, boolean q3vinegar,
                               String q4whorl, String q5arch, String q6loop, boolean q7no, boolean q8yes){
        //Setting initial value of the quiz score variable
        int quiz_score = 0;

        if (!q1ho && q1alcohol && q1ammonia && q1vinegar)
            quiz_score = quiz_score + 1;

        if (q2ammonia && !q2ho && q2alcohol && q2vinegar)
            quiz_score = quiz_score + 1;

        if (!q3ho && q3lemon && q3ammonia && !q3vinegar)
            quiz_score = quiz_score + 1;

        if (q4whorl.equalsIgnoreCase("whorl"))
            quiz_score = quiz_score + 1;

        if (q5arch.equalsIgnoreCase("arch"))
            quiz_score = quiz_score + 1;

        if (q6loop.equalsIgnoreCase("loop"))
            quiz_score = quiz_score + 1;

        if (q7no)
            quiz_score = quiz_score + 1;

        if (q8yes)
            quiz_score = quiz_score + 1;

        return quiz_score;
    }






    public void resetAnswers(View view) {

        CheckBox q1ammonia = (CheckBox) findViewById(R.id.q1ammonia_checkbox);
        q1ammonia.setChecked(false);

        CheckBox q1ho = (CheckBox)findViewById(R.id.q1ho_checkbox);
        q1ho.setChecked(false);

        CheckBox q1alcohol = (CheckBox) findViewById(R.id.q1alcohol_checkbox);
        q1alcohol.setChecked(false);

        CheckBox q1vinegar = (CheckBox)findViewById(R.id.q1vinegar_checkbox);
        q1vinegar.setChecked(false);

        CheckBox q2ammonia = (CheckBox)findViewById(R.id.q2ammonia_checkbox);
        q2ammonia.setChecked(false);

        CheckBox q2ho = (CheckBox)findViewById(R.id.q2ho_checkbox);
        q2ho.setChecked(false);

        CheckBox q2alcohol = (CheckBox)findViewById(R.id.q2alcohol_checkbox);
        q2alcohol.setChecked(false);

        CheckBox q2vinegar = (CheckBox)findViewById(R.id.q2vinegar_checkbox);
        q2vinegar.setChecked(false);

        CheckBox q3ammonia = (CheckBox) findViewById(R.id.q3ammonia_checkbox);
        q3ammonia.setChecked(false);

        CheckBox q3ho = (CheckBox) findViewById(R.id.q3ho_checkbox);
        q3ho.setChecked(false);

        CheckBox q3vinegar = (CheckBox) findViewById(R.id.q3vinegar_checkbox);
        q3vinegar.setChecked(false);

        CheckBox q3lemon = (CheckBox) findViewById(R.id.q3lemon_checkbox);
        q3lemon.setChecked(false);

        EditText q4whorl = (EditText) findViewById(R.id.q4whorlEditText);
        q4whorl.setText("");

        EditText q5arch = (EditText) findViewById(R.id.q5archEditText);
        q5arch.setText("");

        EditText q6loop = (EditText) findViewById(R.id.q6loopEditText);
        q6loop.setText("");

        RadioButton q7yes = (RadioButton) findViewById(R.id.q7yes_radiobutton);
        q7yes.setChecked(false);

        RadioButton q7no = (RadioButton) findViewById(R.id.q7no_radiobutton);
        q7no.setChecked(false);

        RadioButton q8yes = (RadioButton) findViewById(R.id.q8yes_radiobutton);
        q8yes.setChecked(false);

        RadioButton q8no = (RadioButton) findViewById(R.id.q8no_radiobutton);
        q8no.setChecked(false);





    }
}
