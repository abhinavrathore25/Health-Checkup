package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question8 extends AppCompatActivity {

    private Button que8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);

        que8 = (Button)findViewById(R.id.q8);
        que8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion9();
            }
        });
    }
    public void openQuestion9(){
        Intent intent = new Intent(this,Question9.class);
        startActivity(intent);
    }

    public void onDiarrhea (View view){
        MainActivity2.symptoms.add("Diarrhea");
    }
}
