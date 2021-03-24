package com.example.shovel4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Récuperation des variables */
        Button start = (Button) findViewById(R.id.start);
        Button stop = (Button) findViewById(R.id.stop);
        Chronometer screen = (Chronometer) findViewById(R.id.screen);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Log.d("Test","start");
            }
            long elapsedRealTime = SystemClock.elapsedRealtime();
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Log.d("Test", "stop"); }
        });
    }


}