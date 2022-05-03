package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity2 extends AppCompatActivity {
    private Button que1;
    // added for commit on 03052022
    public static ArrayList<String> symptoms = new ArrayList<>();
    public static ArrayList<String> corona = new ArrayList<String>(){{
        add("Fever"); add("Tiredness"); add("Cough");
        add("Nasal Congestion");add("Diarrhea");
    }};
    public static ArrayList<String> SARS = new ArrayList<String>(){{
        add("Fever"); add("Headache"); add("Shivering");
        add("Myalgia");add("Diarrhea");
    }};
    public static ArrayList<String> Swine = new ArrayList<String>(){{
        add("Dehydration"); add("Colored Sputum"); add("Low Blood Pressure");
        add("Chest Pain");add("Dizziness");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        que1 = findViewById(R.id.q1);
        que1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity3();
            }
        });
    }

    public void openActivity3(){
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }

    public void onFever(View view){
        symptoms.add("Fever");
    }
}
