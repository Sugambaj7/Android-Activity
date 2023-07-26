package com.example.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText first_num;
    EditText second_num;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.simple_calculator);
         first_num = findViewById(R.id.editTextNumber1);
         second_num = findViewById(R.id.editTextNumber2);
         output = findViewById(R.id.display_result);
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
    public void perform_add(View v){
        try{
            double first_num_1 = Double.parseDouble(first_num.getText().toString());
            double second_num_1 = Double.parseDouble(second_num.getText().toString());

            double output1 = first_num_1 + second_num_1;
            output.setText("Addition:" +" " + output1);
        }
        catch (NumberFormatException e){
            output.setText("Please enter valid number!!!");
        }

    }
    public void perform_sub(View v){
        try{
            double first_num_1 = Double.parseDouble(first_num.getText().toString());
            double second_num_1 = Double.parseDouble(second_num.getText().toString());

            double output1 = first_num_1 - second_num_1;
            output.setText("Subtraction:" +" " + output1);
        }
        catch (NumberFormatException e){
            output.setText("Please enter valid number!!!");
        }

    }
    public void perform_divide(View v){
        try{
            double first_num_1 = Double.parseDouble(first_num.getText().toString());
            double second_num_1 = Double.parseDouble(second_num.getText().toString());

            double output1 = first_num_1 / second_num_1;
            output.setText("Division:" +" " + output1);
        }
        catch (NumberFormatException e){
            output.setText("Please enter valid number!!!");
        }

    }
    public void perform_multiply(View v){
        try{
            double first_num_1 = Double.parseDouble(first_num.getText().toString());
            double second_num_1 = Double.parseDouble(second_num.getText().toString());

            double output1 = first_num_1 * second_num_1;
            output.setText("Multiplication:" +" " + output1);
        }
        catch (NumberFormatException e){
            output.setText("Please enter valid number!!!");
        }

    }

}