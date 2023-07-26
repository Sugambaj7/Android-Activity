package com.example.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Calculator{
//    EditText first_num;
//    EditText second_num;
//    TextView output;}

    EditText name, roll, gender, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_info);
        name = findViewById(R.id.editTextTextPersonName);
        roll = findViewById(R.id.editTextNumber);
        gender = findViewById(R.id.editTextTextGender);
        address = findViewById(R.id.editTextTextAddress);


        //setContentView(R.layout.activity_main);{simple interest ko lagi}
        //simple calculator{
//        setContentView(R.layout.simple_calculator);
//         first_num = findViewById(R.id.editTextNumber1);
//         second_num = findViewById(R.id.editTextNumber2);
//         output = findViewById(R.id.display_result);}
    }

    //Simple Interest{
//    public void Calculate(View v){
//        EditText principal = (EditText) findViewById(R.id.editTextTextPrincipal);
//        EditText rate = (EditText) findViewById(R.id.editTextTextRate);
//        EditText time = (EditText) findViewById(R.id.editTextTextTime);
//        TextView output = (TextView) findViewById(R.id.result);
//        try{
//            double p1 = Double.parseDouble(principal.getText().toString());
//            double r1 = Double.parseDouble(rate.getText().toString());
//            double t1 = Double.parseDouble(time.getText().toString());
//
//            double output1 = (p1*r1*t1)/100;
//            output.setText("Your Simple Interest:" +" " + output1);
//        }
//        catch (NumberFormatException e){
//            output.setText("Please enter valid number!!!");
//        }
//
//    }
    //}

    //calculator{
//    public void perform_add(View v){
//        try{
//            double first_num_1 = Double.parseDouble(first_num.getText().toString());
//            double second_num_1 = Double.parseDouble(second_num.getText().toString());
//
//            double output1 = first_num_1 + second_num_1;
//            output.setText("Addition:" +" " + output1);
//        }
//        catch (NumberFormatException e){
//            output.setText("Please enter valid number!!!");
//        }
//
//    }
//    public void perform_sub(View v){
//        try{
//            double first_num_1 = Double.parseDouble(first_num.getText().toString());
//            double second_num_1 = Double.parseDouble(second_num.getText().toString());
//
//            double output1 = first_num_1 - second_num_1;
//            output.setText("Subtraction:" +" " + output1);
//        }
//        catch (NumberFormatException e){
//            output.setText("Please enter valid number!!!");
//        }
//
//    }
//    public void perform_divide(View v){
//        try{
//            double first_num_1 = Double.parseDouble(first_num.getText().toString());
//            double second_num_1 = Double.parseDouble(second_num.getText().toString());
//
//            double output1 = first_num_1 / second_num_1;
//            output.setText("Division:" +" " + output1);
//        }
//        catch (NumberFormatException e){
//            output.setText("Please enter valid number!!!");
//        }
//
//    }
//    public void perform_multiply(View v){
//        try{
//            double first_num_1 = Double.parseDouble(first_num.getText().toString());
//            double second_num_1 = Double.parseDouble(second_num.getText().toString());
//
//            double output1 = first_num_1 * second_num_1;
//            output.setText("Multiplication:" +" " + output1);
//        }
//        catch (NumberFormatException e){
//            output.setText("Please enter valid number!!!");
//        }
//
//    }
    //}

    public void displaySecondActivity(View v){
        Intent intent = new Intent(this, Display_Second_Activity.class);

        String name_student = name.getText().toString();
        String roll_student = roll.getText().toString();
        String gender_student = gender.getText().toString();
        String address_student = address.getText().toString();

        intent.putExtra("name_of_student", name_student);
        intent.putExtra("roll_of_student", roll_student);
        intent.putExtra("gender_of_student", gender_student);
        intent.putExtra("address_of_student", address_student);

        startActivity(intent);
    }

}