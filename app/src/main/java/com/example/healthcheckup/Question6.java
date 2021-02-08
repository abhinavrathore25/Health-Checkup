package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question6 extends AppCompatActivity {

    private Button que6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        que6 = (Button)findViewById(R.id.q6);
        que6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion7();
            }
        });
    }
    public void openQuestion7(){
        Intent intent = new Intent(this,Question7.class);
        startActivity(intent);
    }

    public void onShivering (View view){
        MainActivity2.symptoms.add("Shivering");
    }
}
