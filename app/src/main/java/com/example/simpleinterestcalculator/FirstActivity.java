package com.example.simpleinterestcalculator;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    private static final int Req_code_from_NextActivity = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    public void NextActivity(View v){
        Intent intent = new Intent(this,NextActivity.class);
        startActivityForResult.launch(intent);
    }
    ActivityResultLauncher<Intent> startActivityForResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>(){
                        @Override
                        public void onActivityResult(ActivityResult result){
                            if(result.getResultCode() == RESULT_OK){
                                Intent data = result.getData();
                                if(data!=null){
                                    TextView my_secret_msg;
                                    String secretMsg = data.getStringExtra("secret_msg");
                                    my_secret_msg = findViewById(R.id.result_display_area);
                                    my_secret_msg.setText(secretMsg);
                                }
                            }
                        }

                    }

                    );
}