package com.p.tiktok;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int operation = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 1;
            }
        });

        Button subButton = findViewById(R.id.subtract);
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 2;
            }
        });

        Button multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 3;
            }
        });

        Button divisionButton = findViewById(R.id.division);
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = 4;
            }
        });

        Button launchB = findViewById(R.id.launchB);
        launchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.calculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.resultView);
                EditText value1 = findViewById(R.id.num1);
                EditText value2 = findViewById(R.id.num2);


                if (operation == 1) {
                    int result = Integer.parseInt(value1.getText().toString())
                            + Integer.parseInt(value2.getText().toString());
                    textView.setText(String.valueOf(result));
                }

                if (operation == 2) {
                    int result = Integer.parseInt(value1.getText().toString())
                            - Integer.parseInt(value2.getText().toString());
                    textView.setText(String.valueOf(result));
                }

                if (operation == 3) {
                    int result = Integer.parseInt(value1.getText().toString())
                            * Integer.parseInt(value2.getText().toString());
                    textView.setText(String.valueOf(result));
                }

                if (operation == 4) {
                    int result = Integer.parseInt(value1.getText().toString())
                            / Integer.parseInt(value2.getText().toString());
                    textView.setText(String.valueOf(result));
                }
            }
        });
        Log.d("TEST-PARAM", "ON-CREATE");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST-PARAM", "ON-RESUME");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST-PARAM", "ON-START");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST-PARAM", "ON-PAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST-PARAM", "ON-STOP");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST-PARAM", "ON-DESTROY");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("TEST-PARAM", "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("TEST-PARAM", "onRestoreInstanceState");
    }
}