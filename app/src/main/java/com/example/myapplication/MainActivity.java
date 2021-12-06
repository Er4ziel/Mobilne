package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeActivityBTN = findViewById(R.id.button);

        changeActivityBTN.setOnClickListener(v -> changeActivity());

        Button changeActivityBTN2 = findViewById(R.id.button2);

        changeActivityBTN2.setOnClickListener(v -> changeActivity2());

        Button changeActivityBTN3 = findViewById(R.id.button3);

        changeActivityBTN3.setOnClickListener(v -> changeActivity3());



        }


    private void changeActivity() {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    private void changeActivity2() {
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);
    }

    private void changeActivity3() {
        Intent intent = new Intent(this,Activity4.class);
        startActivity(intent);
    }



    }

