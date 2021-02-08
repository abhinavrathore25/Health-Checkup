package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question3 extends AppCompatActivity {

    private Button que3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        que3 = (Button)findViewById(R.id.q3);
        que3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion4();
            }
        });
    }

    public void openQuestion4(){
        Intent intent = new Intent(this,Question4.class);
        startActivity(intent);
    }

    public void onCough(View view){
        MainActivity2.symptoms.add("Cough");
    }
}
