package com.example.simpleinterestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {
    EditText passwordview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        passwordview = findViewById(R.id.editTextTextRandomPsw);
    }

    public void send_secret_msg(View v){
        String password = passwordview.getText().toString().trim();
        if(!password.isEmpty()){
            Intent intent = new Intent(this,FirstActivity.class);
            intent.putExtra("secret_msg", password);
            setResult(RESULT_OK, intent);
            finish();
        }
        else{
            Toast.makeText(this, "Passwordfield cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }
}