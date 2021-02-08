package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question4 extends AppCompatActivity {

    private Button que4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        que4 = (Button)findViewById(R.id.q4);
        que4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion5();
            }
        });
    }

    public void openQuestion5(){
        Intent intent = new Intent(this,Question5.class);
        startActivity(intent);
    }

    public void onHeadache(View view){
        MainActivity2.symptoms.add("Headache");
    }
}
