package com.example.healthcheckup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question10 extends AppCompatActivity {

    private Button que10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);

        que10 = (Button)findViewById(R.id.q10);
        que10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openQuestion11();
            }
        });
    }
    public void openQuestion11(){
        Intent intent = new Intent(this,Question11.class);
        startActivity(intent);
    }

    public void onSputum (View view){
        MainActivity2.symptoms.add("Colored Sputum");
    }
}
