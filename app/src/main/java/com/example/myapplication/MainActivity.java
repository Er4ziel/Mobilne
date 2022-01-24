package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        //----------------ukrywanie paska up----------------
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        //-------------------------------------------------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeActivityBTN = findViewById(R.id.button);

        changeActivityBTN.setOnClickListener(v -> changeActivity());




        Button changeActivityBTN3 = findViewById(R.id.button3);

        changeActivityBTN3.setOnClickListener(v -> changeActivity3());




        }


    private void changeActivity() {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }


    private void changeActivity3() {
        Intent intent = new Intent(this,Dodatki.class);
        startActivity(intent);
    }




    }

