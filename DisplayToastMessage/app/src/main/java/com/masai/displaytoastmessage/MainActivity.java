package com.masai.displaytoastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button activityButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityButton = findViewById(R.id.button_one);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Button one clicked",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        activityButton = findViewById(R.id.button_two);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Button two clicked",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        activityButton = findViewById(R.id.button_three);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),"Button three clicked",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}