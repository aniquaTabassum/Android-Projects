package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuaActivity extends AppCompatActivity {

    Button englishButton;
    Button meowButton;
    Button bengaliButton;
    Button frenchButton;
    MediaPlayer frenchSound;
    MediaPlayer englishSound;
    MediaPlayer meowSound;
    MediaPlayer bengaliSound;
    TextView birthdayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qua);

        initializeButtons();

        addOnClickListeners();
        englishSound = MediaPlayer.create(this, R.raw.english);
        meowSound = MediaPlayer.create(this, R.raw.meow);
        bengaliSound = MediaPlayer.create(this, R.raw.bengali);
        frenchSound = MediaPlayer.create(this, R.raw.french);
    }

    protected void initializeButtons(){
        englishButton = (Button)this.findViewById(R.id.english);
        meowButton = (Button)this.findViewById(R.id.meow);
        bengaliButton = (Button)this.findViewById(R.id.bengali);
        frenchButton = (Button)this.findViewById(R.id.french);
        birthdayText = (TextView)this.findViewById(R.id.birthdayText);

    }

    protected void addOnClickListeners()
    {
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bengaliSound.isPlaying())
                {
                    bengaliSound.stop();
                }
                if(meowSound.isPlaying())
                {
                    meowSound.stop();
                }
                if(frenchSound.isPlaying())
                {
                    frenchSound.stop();
                }
                englishSound.start();


            }
        });

        meowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bengaliSound.isPlaying())
                {
                    bengaliSound.stop();
                }
                if(englishSound.isPlaying())
                {
                    englishSound.stop();
                }
                if(frenchSound.isPlaying())
                {
                    frenchSound.stop();
                }
                meowSound.start();
            }
        });

        bengaliButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(englishSound.isPlaying())
                {
                    englishSound.stop();
                }
                if(meowSound.isPlaying())
                {
                    meowSound.stop();
                }
                if(frenchSound.isPlaying())
                {
                    frenchSound.stop();
                }
                bengaliSound.start();
            }
        });

        frenchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(englishSound.isPlaying())
                {
                    englishSound.stop();
                }
                if(meowSound.isPlaying())
                {
                    meowSound.stop();
                }
                if(frenchSound.isPlaying())
                {
                    frenchSound.stop();
                }
                frenchSound.start();
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(englishSound.isPlaying())
        {
            englishSound.stop();
        }
        if(meowSound.isPlaying())
        {
            meowSound.stop();
        }
        if(frenchSound.isPlaying())
        {
            frenchSound.stop();
        }
        if(frenchSound.isPlaying())
        {
            frenchSound.stop();
        }

        super.onBackPressed();
    }

    @Override
    public void onStop(){
        if(englishSound.isPlaying())
        {
            englishSound.stop();
        }
        if(meowSound.isPlaying())
        {
            meowSound.stop();
        }
        if(frenchSound.isPlaying())
        {
            frenchSound.stop();
        }
        if(frenchSound.isPlaying())
        {
            frenchSound.stop();
        }
        super.onStop();
        finish();
    }
}