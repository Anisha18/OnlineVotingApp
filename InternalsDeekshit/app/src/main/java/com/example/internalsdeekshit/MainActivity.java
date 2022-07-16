package com.example.internalsdeekshit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button start,reset;
    EditText editText;
    Chronometer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.submit);
        counter=findViewById(R.id.counter);
        reset=findViewById(R.id.reset);
        editText=findViewById(R.id.ed1);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=editText.getText().toString();
                if(!str.equals("")) {
                    int num1 = Integer.valueOf(str);
                    int value = (num1 * 1000)+1000;
                    counter.start();
                    resetCounter();
                    if(value>0) {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                                startActivity(intent);
                            }
                        }, value);
                    }
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetCounter();

            }
        });
    }
    void resetCounter()
    {
        counter.setBase(SystemClock.elapsedRealtime());
    }
}