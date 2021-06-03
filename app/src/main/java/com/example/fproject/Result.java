package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String score = getIntent().getStringExtra("score");
        TextView tx = findViewById(R.id.result);


        if(score.equals("5")){
            tx.setText("Congratulation you scored 100% !!");
        }if(score.equals("4")){
            tx.setText("Very good you scored 80% !!");
        }if(score.equals("3")){
            tx.setText("Nice scored 60% !!");
        }if(score.equals("2")){
            tx.setText("You failed the test");
        }if(score.equals("1")){
            tx.setText("Study more!!");
        }
        else {
            tx.setText("Try again!! Remember its negative marking");
        }
    }
}