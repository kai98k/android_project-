package com.example.application1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Button_Java extends AppCompatActivity {
    Button button_01,button_02;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_java);

        button_01 = findViewById(R.id.btn_1);
        button_02 = findViewById(R.id.btn_2);


        button_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_01.setText("已按下按鈕一:"+i+"次");
                i++;
            }
        });

        button_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}