package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class TestForm extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioButton radioButton;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    public int score = 0;
    public int method = 0;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String test = getIntent().getStringExtra("Course");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_form);
        radioGroup = findViewById(R.id.RadioGroup);
        radioGroup1 = findViewById(R.id.RadioGroup1);
        radioGroup2 = findViewById(R.id.RadioGroup2);
        radioGroup3 = findViewById(R.id.RadioGroup3);
        radioGroup4 = findViewById(R.id.RadioGroup4);
        if(test.equals("Artificial Intelligence")){
        aI();
        }
        if(test.equals("Software construction")){
            sC();
        }
        if(test.equals("Mobile application and development")){
            mAD();
        }
        if(test.equals("Finite theory of automata")){
            fAT();
        }
        if(test.equals("Software engineering")){
            sE();
        }
        if(test.equals("Java language")){
            javaLan();
        }
        else{

        }
    }

    private void javaLan() {
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "Java is not able to do garbage collection."; //false
        String ques2 = "Java does not support object oriented programming technique."; //false
        String ques3 = "Java is a low level language."; //false
        String ques4 = "Most often Java is used to build large enterprise class applications."; //true
        String ques5 = "Java is dead now."; //false
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 1;
    }

    private void sE() {
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "This subject requires coding deep understanding of coding syntax"; //false
        String ques2 = "In safety-critical areas such as space, aviation, nuclear power plants, etc. the cost of software failure can be massive because lives are at risk. "; //True
        String ques3 = "Dealing with the increased complexity of software need for new applications required software engineer."; //True
        String ques4 = "Interfaces, Hashing, Cashing and concurrency are the only main concepts of Software engineering."; //false
        String ques5 = "Being a SE is not a big deal."; //false
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 2;
    }

    public void aI(){
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "Human has progressed so much in general artificial intelligence."; //false
        String ques2 = "Artificial intelligence is a new concept."; //false
        String ques3 = "First AI robot was build in aug 12 2002."; //false
        String ques4 = "Machine learning is a part of AI."; //true
        String ques5 = "Big tech companies are investing loads of Dollars in AI. "; //true
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 3;
    }
    public void sC(){
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "OOP is not necessary for Software Construction."; //false
        String ques2 = "The term software construction refers to the detailed creation of working software through a combination of coding, verification, unit testing, integration testing, and debugging."; //true
        String ques3 = "Software construction is a software engineering discipline."; //true
        String ques4 = "Software is developed or engineered but it is not manufactured."; //true
        String ques5 = "Software Construction helps to deal with code complexity, changeability, re-usability."; //true
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 4;
    }
    public void mAD(){
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "There is only one layout in Mobile Application development."; //false
        String ques2 = "Mobile Application development is only done Java language."; //false
        String ques3 = "A typical mobile application utilizes a network connection to work with remote computing resources."; //true
        String ques4 = "Mobile application development is the process of creating software applications that run on a mobile device."; //true
        String ques5 = "Android user are less then iOS users."; //false
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 5;
    }
    public void fAT(){
        TextView q1 = findViewById(R.id.question1);
        TextView q2 = findViewById(R.id.question2);
        TextView q3 = findViewById(R.id.question3);
        TextView q4 = findViewById(R.id.question4);
        TextView q5 = findViewById(R.id.question5);
        String ques1 = "Computers use NFA more then DFA.";  //false
        String ques2 = "We connot convert a DFA into NFA";  //false
        String ques3 = " Any given WORD in the language has a specific, infinite length";   //false
        String ques4 = "English is a formal language."; //True
        String ques5 = "Often overuse of short and simple sentences."; //false
        q1.setText(ques1);
        q2.setText(ques2);
        q3.setText(ques3);
        q4.setText(ques4);
        q5.setText(ques5);
        method = 6;
    }
    public void formSubmit(View view){
        int check = radioGroup.getCheckedRadioButtonId();
        int check1 = radioGroup1.getCheckedRadioButtonId();
        int check2 = radioGroup2.getCheckedRadioButtonId();
        int check3 = radioGroup3.getCheckedRadioButtonId();
        int check4 = radioGroup4.getCheckedRadioButtonId();
        radioButton = findViewById(check);
        radioButton1 = findViewById(check1);
        radioButton2 = findViewById(check2);
        radioButton3 = findViewById(check3);
        radioButton4 = findViewById(check4);


        //checking
//        Toast.makeText(this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, radioButton1.getText(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, radioButton2.getText(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, radioButton3.getText(), Toast.LENGTH_SHORT).show();
//        Toast.makeText(this, radioButton4.getText(), Toast.LENGTH_SHORT).show();
//        if(radioButton.getText().equals("False")){
//                    score++;
//        }
//        else if(radioButton.getText().equals("True")) {
//            score--;
//        }
//        if(radioButton1.getText().equals("False")){
//            score++;
//        }
//        else {
//            score--;
//        }
        Toast.makeText(this, String.valueOf(method), Toast.LENGTH_SHORT).show();


        try{


        switch (method){

            case 1:
            case 6:
                if(radioButton.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score=score-1;
                }
                if(radioButton1.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score=score-1;
                }
                if(radioButton2.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score=score-1;
                }

                if(radioButton3.getText().equals("True")){
                    score= score+1;
                }
                else{
                    score=score-1;
                }
                if(radioButton4.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score=score-1;
                }
                break;
            case 2:
                if(radioButton.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;

                }
                if(radioButton1.getText().equals("True")){
                    score= score+1;
                }
                else {
                score= score-1;
                }
                if(radioButton2.getText().equals("True")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                if(radioButton3.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;

                }
                if(radioButton4.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                break;
            case 3:
                if(radioButton.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score= score-1;
                }
                 if(radioButton1.getText().equals("False")){
                    score= score+1;

                }
                else{
                    score= score-1;

                }
                 if(radioButton2.getText().equals("False")){
                    score= score+1;

                }
                else{
                    score= score-1;

                }
                if(radioButton3.getText().equals("True")){
                    score= score+1;

                }
                else {
                    score= score-1;

                }

                if(radioButton4.getText().equals("True")){
                    score= score+1;

                }
                else {
                    score= score-1;
                }
                break;
//
            case 4:
                if(radioButton.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                if(radioButton1.getText().equals("True")) {
                    score= score+1;

                }
                else{
                    score= score-1;
                }
                if(radioButton2.getText().equals("True")){
                    score= score+1;

                }
                else {
                    score= score-1;
                }
                if(radioButton3.getText().equals("True")){
                    score= score+1;

                }

                else{
                    score= score-1;
                }

                if(radioButton4.getText().equals("True")){
                        score= score+1;
                }
                else {
                    score= score-1;
                }
                break;
            case 5:
                if(radioButton.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                if(radioButton1.getText().equals("False")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                if(radioButton2.getText().equals("True")){
                    score= score+1;
                }
                else{
                    score= score-1;
                }
                if(radioButton3.getText().equals("True")){
                    score= score+1;
                }
                else{
                        score= score-1;
                }
                if(radioButton4.getText().equals("False")){
                    score= score+1;
                }
                else {
                    score= score-1;
                }
                break;
            default:
                    Toast.makeText(this, "DJ Got us fallen again.", Toast.LENGTH_SHORT).show();
        }
        String st = String.valueOf(score);
            Intent result = new Intent(getApplicationContext(), Result.class);
            result.putExtra("score",st);
            startActivity(result);
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


        
    }
}