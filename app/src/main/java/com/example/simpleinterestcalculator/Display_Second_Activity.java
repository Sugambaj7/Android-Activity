package com.example.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Display_Second_Activity extends AppCompatActivity {
    TextView name,roll,gender,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_second);

        String receivedName = getIntent().getStringExtra("name_of_student");
        String receivedRoll = getIntent().getStringExtra("roll_of_student");
        String receivedGender = getIntent().getStringExtra("gender_of_student");
        String receivedAddress = getIntent().getStringExtra("address_of_student");

        name = findViewById(R.id.name);
        name.setText(receivedName);

        roll = findViewById(R.id.roll);
        roll.setText(receivedRoll);

        gender = findViewById(R.id.gender);
        gender.setText(receivedGender);

        address = findViewById(R.id.address);
        address.setText(receivedAddress);
    }
}