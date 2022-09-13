package com.android.first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText tvName, tvPassword;
    public TextView txtName,txtPassword;
    public Button btnIntent,btnOptions;
    public CheckBox cboxOption1, cboxOption2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent + Options Buttons
        cboxOption1 = (CheckBox) findViewById(R.id.cboxOption1);
        cboxOption2 = (CheckBox) findViewById(R.id.cboxOption2);
        btnIntent = (Button) findViewById(R.id.btnIntent);
        btnOptions = (Button) findViewById(R.id.btnOptions);
        tvName = (EditText) findViewById(R.id.editTextName);
        tvPassword = (EditText) findViewById(R.id.editTextPassword);

        //Methods for buttons
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent secondaryView = new Intent(MainActivity.this, SecondLoadingActivity.class);
                startActivity(secondaryView);
            }
        });
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verify();
            }
        });
    }

    //Options btn Functional Method
    public void verify(){
        String texto = "Seleccionado: ";
        if(this.cboxOption1.isChecked()){
            texto += "Option 1";
        } else if(this.cboxOption2.isChecked()){
            texto += "Option 2";
        } else {
            texto = "Ninguna Opcion Seleccionada";
        }
        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }

}