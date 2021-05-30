package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try
        {
            sqLiteDatabase = this.openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
            Cursor cursor = sqLiteDatabase.rawQuery("select * from MyUsers", null);
            int Username = cursor.getColumnIndex("User_name");
            int password = cursor.getColumnIndex("Password");
            cursor.moveToFirst();
            ListView listView = findViewById(R.id.Userslist);
            ArrayList<String> arrayList = new ArrayList<>();
            while (!cursor.isAfterLast()) {
                arrayList.add(cursor.getString(Username));
                cursor.moveToNext();
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
            listView.setAdapter(arrayAdapter);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void signUpActivity(View view){
        Intent intent =new Intent(getApplicationContext(), SignUpActivity.class);
        startActivity(intent);
    }
    public void loginActivity(View view){
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}