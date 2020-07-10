package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button quaButton;
    Button instrumentButton;

    TextView birthdayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);

        setContentView(R.layout.activity_main);

        initializeButtons();

        addOnClickListeners();

    }

    protected void initializeButtons(){
         quaButton = (Button)this.findViewById(R.id.qua);
         instrumentButton = (Button)this.findViewById(R.id.instrument);
         birthdayText = (TextView)this.findViewById(R.id.birthdayText);

    }

    protected void addOnClickListeners()
    {
        quaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.birthdaygift.QuaActivity.class);
                startActivity(intent);


            }
        });

        instrumentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, com.example.birthdaygift.InstrumentActivity.class);
                startActivity(intent);
            }
        });


    }


}