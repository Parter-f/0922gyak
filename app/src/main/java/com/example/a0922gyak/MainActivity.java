package com.example.a0922gyak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText szovegbox;
    private Button gomb1;
    private Button gomb2;
    private Button gomb3;
    private TextView eredmeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void gomb1click(){



    }

    private void init(){

        szovegbox = findViewById(R.id.szovegbox);
        gomb1 = findViewById(R.id.gomb1);
        gomb2 = findViewById(R.id.gomb2);
        gomb3 = findViewById(R.id.gomb3);
        eredmeny = findViewById(R.id.eredmeny);

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


    }

}