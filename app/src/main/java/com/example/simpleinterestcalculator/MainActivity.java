package com.example.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Calculate(View v){
        EditText principal = (EditText) findViewById(R.id.editTextTextPrincipal);
        EditText rate = (EditText) findViewById(R.id.editTextTextRate);
        EditText time = (EditText) findViewById(R.id.editTextTextTime);
        TextView output = (TextView) findViewById(R.id.result);
        try{
            double p1 = Double.parseDouble(principal.getText().toString());
            double r1 = Double.parseDouble(rate.getText().toString());
            double t1 = Double.parseDouble(time.getText().toString());

            double output1 = (p1*r1*t1)/100;
            output.setText("Your Simple Interest:" +" " + output1);
        }
        catch (NumberFormatException e){
            output.setText("Please enter valid number!!!");
        }

    }

}