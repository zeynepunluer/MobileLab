package com.example.mobileapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button btnArrayAdapter;
    Button btnCustomAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdapter = findViewById(R.id.buttonCustomAdapter);
        btnArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, ArrayAdaptorActivity.class);
                startActivity(intent);
            }
        });
        btnCustomAdaptor= findViewById(R.id.buttonCustomAdapter);
        btnCustomAdaptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomAdaptorActivity.class);
                startActivity((intent));

            }
        });

    }
}