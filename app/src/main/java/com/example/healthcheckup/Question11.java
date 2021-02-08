package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question11 extends AppCompatActivity {

    private Button que11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question11);

        que11 = (Button)findViewById(R.id.q11);
        que11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion12();
            }
        });
    }
    public void openQuestion12(){
        Intent intent = new Intent(this,Question12.class);
        startActivity(intent);
    }

    public void onPain (View view){
        MainActivity2.symptoms.add("Chest Pain");
    }
}
