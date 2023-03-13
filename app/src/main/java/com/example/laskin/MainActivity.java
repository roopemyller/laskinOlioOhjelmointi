package com.example.laskin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numInput1;
    private EditText numInput2;
    private TextView numOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numInput1 = findViewById(R.id.EditNum1);
        numInput2 = findViewById(R.id.EditNum2);
        numOutput = findViewById(R.id.OutputField);
    }
    public void plus(View view){
        if (!numInput1.getText().toString().isEmpty() && !numInput2.getText().toString().isEmpty()) {
            int tulos = Integer.parseInt(numInput1.getText().toString()) + Integer.parseInt((numInput2.getText().toString()));
            numOutput.setText(String.valueOf(tulos));
        }
    }
    public void minus(View view){
        if (!numInput1.getText().toString().isEmpty() && !numInput2.getText().toString().isEmpty()) {
            int tulos = Integer.parseInt(numInput1.getText().toString()) - Integer.parseInt((numInput2.getText().toString()));
            numOutput.setText(String.valueOf(tulos));
        }
    }
    public void multiply(View view){
        if (!numInput1.getText().toString().isEmpty() && !numInput2.getText().toString().isEmpty()) {
            int tulos = Integer.parseInt(numInput1.getText().toString()) * Integer.parseInt((numInput2.getText().toString()));
            numOutput.setText(String.valueOf(tulos));
        }
    }
    public void divide(View view){
        if (!numInput1.getText().toString().isEmpty() && !numInput2.getText().toString().isEmpty()) {
            int tulos = Integer.parseInt(numInput1.getText().toString()) / Integer.parseInt((numInput2.getText().toString()));
            numOutput.setText(String.valueOf(tulos));
        }
    }
}