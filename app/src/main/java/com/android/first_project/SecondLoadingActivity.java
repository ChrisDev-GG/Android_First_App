package com.android.first_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondLoadingActivity extends AppCompatActivity {
    public Button btnSecondIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_loading);

        btnSecondIntent = (Button) findViewById(R.id.btnSecondIntent);
        btnSecondIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdIntent = new Intent(SecondLoadingActivity.this, ExtraActivity.class);
                startActivity(thirdIntent);
            }
        });
    }
}
