package com.example.fproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import java.util.ArrayList;

public class TestAppEducation extends AppCompatActivity {
    public String courseTest = "";
    TestForm testForm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_app_education);
        ListView listView = findViewById(R.id.courses);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Artificial Intelligence");
        arrayList.add("Software construction");
        arrayList.add("Mobile application and development");
        arrayList.add("Finite theory of automata");
        arrayList.add("Software engineering");
        arrayList.add("Java language");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TestAppEducation.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
                //Toast.makeText(TestAppEducation.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
                if(arrayList.get(position).equals("Artificial Intelligence")){
                    testForm = new TestForm();
                   // Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    courseTest = arrayList.get(position);
                    test.putExtra("Course", courseTest);
                    startActivity(test);
                }
                else if(arrayList.get(position).equals("Software construction")){
                    //Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    test.putExtra("Course","Software construction");
                    startActivity(test);
                }
                else if(arrayList.get(position).equals("Mobile application and development")){
                    //Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    test.putExtra("Course","Mobile application and development");
                    startActivity(test);
                }
                else if(arrayList.get(position).equals("Finite theory of automata")){
                    //Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    test.putExtra("Course","Finite theory of automata");
                    startActivity(test);
                }
                else if(arrayList.get(position).equals("Software engineering")){
                    //Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    test.putExtra("Course","Software engineering");
                    startActivity(test);
                }
                else if(arrayList.get(position).equals("Java language")){
                    //Toast.makeText(TestAppEducation.this, "alas", Toast.LENGTH_SHORT).show();
                    Intent test = new Intent(getApplicationContext(),TestForm.class);
                    test.putExtra("Course","Java language");
                    startActivity(test);
                }
            }
        });


    }
}