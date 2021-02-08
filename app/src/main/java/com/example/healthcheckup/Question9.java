package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question9 extends AppCompatActivity {

    private Button que9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);

        que9 = (Button)findViewById(R.id.q9);
        que9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion10();
            }
        });
    }
    public void openQuestion10(){
        Intent intent = new Intent(this,Question10.class);
        startActivity(intent);
    }

    public void onDehydration (View view){
        MainActivity2.symptoms.add("Dehydration");
    }
}
