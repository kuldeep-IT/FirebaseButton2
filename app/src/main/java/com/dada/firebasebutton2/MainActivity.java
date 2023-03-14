package com.dada.firebasebutton2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dada.firebasebutton.CustomButton;

public class MainActivity extends AppCompatActivity {

    CustomButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.fireBaseButton);

        button.setCustomClickListener(new CustomButton.CustomOnClickListener() {
            @Override
            public void onClick(View var1) {
                Toast.makeText(MainActivity.this,"Custom Button Clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}