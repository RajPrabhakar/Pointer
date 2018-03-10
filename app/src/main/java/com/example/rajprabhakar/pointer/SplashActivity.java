package com.example.rajprabhakar.pointer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressBar = findViewById(R.id.progress);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int progress = 0; progress<100; progress++) {
                    try {
                        Thread.sleep(30);
                        progressBar.setProgress(progress);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }).start();
    }
}
