package com.google.intentprocess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TEXT = "PARAM";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();

        String ssss = (String) getIntent().getSerializableExtra(TEXT);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        try {
            String text  = bundle.getString(TEXT);// получить данные из Intent
            TextView textView = findViewById(R.id.textEcho);
            textView.setText(ssss); // Сохранить их в TextView
        }catch (Exception E){

        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent runEchoIntent = new Intent();
                runEchoIntent.setComponent(new ComponentName("com.android.calculator","com.android.calculator.MainActivity"));
                startActivity(runEchoIntent);
            }
        });
    }

    public void initialization() {
        button = (Button) findViewById(R.id.button);
    }
}