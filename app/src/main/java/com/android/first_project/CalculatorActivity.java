package com.android.first_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatorActivity extends AppCompatActivity {

    public EditText num1, num2;
    public TextView txtResult;
    public Button btnSumar,btnRestar,btnDividir,btnMultiplicar,btnNextIntent,btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        //Calculadora
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnNextIntent = (Button) findViewById(R.id.btnIntent);
        btnReset = (Button) findViewById(R.id.btnOptions);

        //Calculadora Methods
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(String.valueOf(num1.getText()));
                int numero2 = Integer.parseInt(String.valueOf(num2.getText()));
                String result = String.valueOf(numero1+numero2);
                txtResult.setText(result);
            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(String.valueOf(num1.getText()));
                int numero2 = Integer.parseInt(String.valueOf(num2.getText()));
                String result = String.valueOf(numero1-numero2);
                txtResult.setText(result);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(String.valueOf(num1.getText()));
                int numero2 = Integer.parseInt(String.valueOf(num2.getText()));
                String result = String.valueOf(numero1*numero2);
                txtResult.setText(result);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero1 = Integer.parseInt(String.valueOf(num1.getText()));
                int numero2 = Integer.parseInt(String.valueOf(num2.getText()));
                String result = String.valueOf(numero1/numero2);
                txtResult.setText(result);
            }
        });

        btnNextIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondaryView = new Intent(CalculatorActivity.this, SecondLoadingActivity.class);
                startActivity(secondaryView);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("Numero 1");
                num2.setText("Numero 2");
            }
        });
    }

}
