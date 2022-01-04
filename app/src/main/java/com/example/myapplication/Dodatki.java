package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Dodatki extends AppCompatActivity {

    Button camera;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //----------------ukrywanie paska up----------------
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        //-------------------------------------------------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodatki);
        camera = (Button)findViewById(R.id.button6);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivity(intent);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Button changeActivityBTN4 = findViewById(R.id.button4);

        changeActivityBTN4.setOnClickListener(v -> changeActivity4());

        Button changeActivityBTN5 = findViewById(R.id.button5);

        changeActivityBTN5.setOnClickListener(v -> changeActivity5());





    }


    private void changeActivity4() {
        Intent intent = new Intent(this,Kompas.class);
        startActivity(intent);
    }

    private void changeActivity5() {
        Intent intent = new Intent(this,Latarka.class);
        startActivity(intent);
    }





}