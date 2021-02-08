package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question5 extends AppCompatActivity {

    private Button que5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        que5 = (Button)findViewById(R.id.q5);
        que5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion6();
            }
        });
    }

    public void openQuestion6(){
        Intent intent = new Intent(this,Question6.class);
        startActivity(intent);
    }

    public void onNasal(View view){
        MainActivity2.symptoms.add("Nasal Congestion");
    }
}
