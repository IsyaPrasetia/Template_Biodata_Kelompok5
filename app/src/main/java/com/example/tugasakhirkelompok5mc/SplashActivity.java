package com.example.tugasakhirkelompok5mc;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        View logo = findViewById(R.id.splashLogo);
        TextView title = findViewById(R.id.splashTitle);
        TextView subtitle = findViewById(R.id.splashSubtitle);

        // Start hidden
        logo.setAlpha(0f);
        title.setAlpha(0f);
        subtitle.setAlpha(0f);

        // Fade + scale in
        logo.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(800)
                .start();

        title.animate()
                .alpha(0.9f)
                .setDuration(800)
                .setStartDelay(300)
                .start();

        subtitle.animate()
                .alpha(0.7f)
                .setDuration(800)
                .setStartDelay(500)
                .start();

        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish();
        }, 2200);
    }
}
