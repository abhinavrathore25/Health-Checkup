package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    private Button que2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        que2 = (Button)findViewById(R.id.q2);
        que2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion3();
            }
        });
    }

    public void openQuestion3(){
        Intent intent = new Intent(this,Question3.class);
        startActivity(intent);
    }

    public void clkTiredness(View view) {
        MainActivity2.symptoms.add("Tiredness");
    }
}