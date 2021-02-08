package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question7 extends AppCompatActivity {

    private Button que7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        que7 = (Button)findViewById(R.id.q7);
        que7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion8();
            }
        });
    }
    public void openQuestion8(){
        Intent intent = new Intent(this,Question8.class);
        startActivity(intent);
    }

    public void onMyalgia (View view){
        MainActivity2.symptoms.add("Myalgia");
    }
}
