package com.example.birthdaygift;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InstrumentActivity extends AppCompatActivity {

    Button auroraButton;
    Button spaceButton;
    Button dreamyButton;
    Button choirButton;
    MediaPlayer choirSound;
    MediaPlayer auroraSound;
    MediaPlayer spaceSound;
    MediaPlayer dreamySound;
    TextView birthdayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruments);

        initializeButtons();

        addOnClickListeners();
        auroraSound = MediaPlayer.create(this, R.raw.aurora);
        spaceSound = MediaPlayer.create(this, R.raw.space);
        dreamySound = MediaPlayer.create(this, R.raw.dreamy);
        choirSound = MediaPlayer.create(this, R.raw.choir);
    }

    protected void initializeButtons(){
        auroraButton = (Button)this.findViewById(R.id.aurora);
        spaceButton = (Button)this.findViewById(R.id.space);
        dreamyButton = (Button)this.findViewById(R.id.dreamy);
        choirButton = (Button)this.findViewById(R.id.choir);
        birthdayText = (TextView)this.findViewById(R.id.birthdayText);

    }

    protected void addOnClickListeners()
    {
        auroraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dreamySound.isPlaying())
                {
                    dreamySound.stop();
                }
                if(choirSound.isPlaying())
                {
                    choirSound.stop();
                }
                if(spaceSound.isPlaying())
                {
                    spaceSound.stop();
                }
                auroraSound.start();


            }
        });

        spaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dreamySound.isPlaying())
                {
                    dreamySound.stop();
                }
                if(choirSound.isPlaying())
                {
                    choirSound.stop();
                }
                if(auroraSound.isPlaying())
                {
                    auroraSound.stop();
                }
                spaceSound.start();
            }
        });

        dreamyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(spaceSound.isPlaying())
                {
                    spaceSound.stop();
                }
                if(choirSound.isPlaying())
                {
                    choirSound.stop();
                }
                if(auroraSound.isPlaying())
                {
                    auroraSound.stop();
                }
                dreamySound.start();
            }
        });

        choirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(dreamySound.isPlaying())
                {
                    dreamySound.stop();
                }
                if(spaceSound.isPlaying())
                {
                    spaceSound.stop();
                }
                if(auroraSound.isPlaying())
                {
                    auroraSound.stop();
                }
                choirSound.start();
            }
        });
    }


    @Override
    public void onBackPressed() {
        if(dreamySound.isPlaying())
        {
            dreamySound.stop();
        }
        if(spaceSound.isPlaying())
        {
            spaceSound.stop();
        }
        if(auroraSound.isPlaying())
        {
            auroraSound.stop();
        }
        if(choirSound.isPlaying())
        {
            choirSound.stop();
        }

        super.onBackPressed();
    }
    @Override
    public void onStop(){
        if(dreamySound.isPlaying())
        {
            dreamySound.stop();
        }
        if(spaceSound.isPlaying())
        {
            spaceSound.stop();
        }
        if(auroraSound.isPlaying())
        {
            auroraSound.stop();
        }
        if(choirSound.isPlaying())
        {
            choirSound.stop();
        }
        super.onStop();
        finish();
    }
}