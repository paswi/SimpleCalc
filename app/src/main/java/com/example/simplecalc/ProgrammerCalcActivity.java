package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProgrammerCalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmer_calc);
        Intent startingIntent = getIntent();
    }

    public void buttonAndClick(View v) {
        EditText editTextA = findViewById(R.id.editTextNumber12);
        EditText editTextB = findViewById(R.id.editTextNumber22);
        EditText editTextResult = findViewById(R.id.editTextNumberResult2);
        EditText editTextResultBinary = findViewById(R.id.editTextNumberResultBinary2);

        int a,b;
        try {
            a = Integer.parseInt(editTextA.getText().toString());
        } catch(Exception e) {
            a = 0;
            editTextA.setText("0");
        }
        try {
            b = Integer.parseInt(editTextB.getText().toString());
        } catch (Exception e) {
            b = 0;
            editTextB.setText("0");
        }
        int result = a & b;

        editTextResult.setText(Integer.toString(result));
        editTextResultBinary.setText(Integer.toBinaryString(result));
    }
}