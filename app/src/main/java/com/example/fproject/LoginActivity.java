package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void openApplication(View view){
        try{
            EditText userName = findViewById(R.id.editTextUserName);
            String name = userName.getText().toString();
            EditText pass = findViewById(R.id.editTextPassword);
            String password = pass.getText().toString();
            sqLiteDatabase = this.openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
            Cursor cursor = sqLiteDatabase.rawQuery("select * from MyUsers", null);
            int Username = cursor.getColumnIndex("User_name");
            int pas = cursor.getColumnIndex("Password");

            cursor.moveToFirst();


            if(name.equals("") || password.equals("")){
                Toast.makeText(LoginActivity.this, "Must Enter a UserName and password", Toast.LENGTH_SHORT).show();
            }
            while(cursor.moveToNext()){
                if(name.equals(cursor.getString(0)) && password.equals(cursor.getString(1))) {
                    Intent intent = new Intent(getApplicationContext(), TestAppEducation.class);
                    startActivity(intent);
                    break;
                }
                else{
                    Toast.makeText(this, "User does not exist.", Toast.LENGTH_SHORT).show();
                }
            }
        }
        catch (Exception e){
            Toast.makeText(this, "Problem", Toast.LENGTH_SHORT).show();
        }
        
    }
    public void home(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}