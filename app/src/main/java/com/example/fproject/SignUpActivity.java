package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        sqLiteDatabase = openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
        sqLiteDatabase.execSQL("Create table if not exists MyUsers(User_name varchar(200), Password varchar(200))");

    }
//    public boolean isValid(String name){
//        Pattern user_name = Pattern.compile("^([a-zA-Z])+([\\w]{2,})+$");
//
//        //String regex = "^([a-zA-Z])+([\\w]{2,})+$";
//
//        Matcher matcher = user_name.matcher(name);
//        return matcher.matches();
//    }
    public void application(View view)
    {

        try{
            EditText userName = findViewById(R.id.editTextUserName);
            String name = userName.getText().toString();
            EditText pass = findViewById(R.id.editTextPassword);
            String password = pass.getText().toString();

            if(name.equals("") || password.equals("")){
                Toast.makeText(SignUpActivity.this, "Must Enter a UserName and password", Toast.LENGTH_SHORT).show();
            }
//            else if(s.isValid(name)){
//                sqLiteDatabase.execSQL("Insert into MyUsers(UserName, Password) values('"+name+"','"+password+"')");
//                Intent intent = new Intent(getApplicationContext(), TestAppEducation.class);
//                startActivity(intent);
//                Toast.makeText(this, "Added to database", Toast.LENGTH_SHORT).show();
//            }
            else{
                sqLiteDatabase.execSQL("Insert into MyUsers(User_name,Password) values('"+name+"','"+password+"')");
                Intent intent = new Intent(getApplicationContext(), TestAppEducation.class);
                startActivity(intent);
                Toast.makeText(this, "Added to database", Toast.LENGTH_SHORT).show();
                //Toast.makeText(SignUpActivity.this, "Username Is not Valid", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception ex){
            Toast.makeText(this, "What the hell", Toast.LENGTH_SHORT).show();
        }

    }
    public void home(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}