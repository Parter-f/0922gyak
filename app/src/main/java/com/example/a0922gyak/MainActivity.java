package com.example.a0922gyak;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText szovegbox;
    private Button gomb1;
    private Button gomb2;
    private Button gomb3;
    private TextView eredmeny;
    private Random rnd;
    private int red;
    private int green;
    private int blue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    private void init(){

        szovegbox = findViewById(R.id.szovegbox);
        gomb1 = findViewById(R.id.gomb1);
        gomb2 = findViewById(R.id.gomb2);
        gomb3 = findViewById(R.id.gomb3);
        eredmeny = findViewById(R.id.eredmeny);
        rnd = new Random();

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eredmeny.setText(szovegbox.getText().toString().toUpperCase());


            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eredmeny.setText(szovegbox.getText().toString().toLowerCase());

            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            red = rnd.nextInt(256);
            green = rnd.nextInt(256);
            blue = rnd.nextInt(256);

            eredmeny.setBackgroundColor(Color.rgb(red , green , blue));

            }
        });


    }

}