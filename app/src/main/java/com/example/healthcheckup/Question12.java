package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question12 extends AppCompatActivity {

    private Button que12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question12);

        que12 = (Button)findViewById(R.id.q12);
        que12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion13();
            }
        });
    }
    public void openQuestion13(){
        Intent intent = new Intent(this,Question13.class);
        startActivity(intent);
    }

    public void onLow (View view){
        MainActivity2.symptoms.add("Low Blood Pressure");
    }
}
