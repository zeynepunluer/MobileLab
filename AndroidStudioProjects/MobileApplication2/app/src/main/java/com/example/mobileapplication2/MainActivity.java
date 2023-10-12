package com.example.mobileapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    Button buttonArrayAdapter;
    Button buttonCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonArrayAdapter = findViewById(R.id.buttonArrayAdapter);
        buttonArrayAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( MainActivity.this, ArrayAdapterActivity.class);
                startActivity(intent);
            }
        });
        buttonCustomAdapter= findViewById(R.id.buttonCustomAdapter);
        buttonCustomAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity((intent));

            }
        });

    }
}