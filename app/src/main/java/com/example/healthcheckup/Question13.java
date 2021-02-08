package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Collections;

public class Question13 extends AppCompatActivity {
    private Button que13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question13);

        que13 = (Button)findViewById(R.id.q13);
        que13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openResults();
            }
        });
    }

    public void openResults(){

        Collections.sort(MainActivity2.corona);
        Collections.sort(MainActivity2.SARS);
        Collections.sort(MainActivity2.Swine);
        Collections.sort(MainActivity2.symptoms);

        if(MainActivity2.symptoms.equals(MainActivity2.corona))
        {
            MainActivity2.symptoms.clear();
            Intent intent = new Intent(this,Corona.class);
            startActivity(intent);
        }
        else if(MainActivity2.symptoms.equals(MainActivity2.SARS))
        {
            MainActivity2.symptoms.clear();
            Intent intent = new Intent(this,Sars.class);
            startActivity(intent);
        }
        else if(MainActivity2.symptoms.equals(MainActivity2.Swine))
        {
            MainActivity2.symptoms.clear();
            Intent intent = new Intent(this,Swine.class);
            startActivity(intent);
        }
        else
        {
            MainActivity2.symptoms.clear();
            Intent intent = new Intent(this,Safe.class);
            startActivity(intent);
        }
    }


    public void onDizziness (View view){
        MainActivity2.symptoms.add("Dizziness");
    }
}
