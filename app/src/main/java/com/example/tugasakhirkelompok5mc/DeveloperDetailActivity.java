package com.example.tugasakhirkelompok5mc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DeveloperDetailActivity extends AppCompatActivity {

    private static final String TAG = "DevDetail";
    private Handler clockHandler;
    private Runnable clockRunnable;
    private TextView tvClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_developer_detail);
        } catch (Exception e) {
            Log.e(TAG, "Layout inflation failed", e);
            finish();
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_developer_detail), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int index = getIntent().getIntExtra("developer_index", 1);
        String prefix = "dev" + index;

        int nameRes = getResources().getIdentifier(prefix + "_name", "string", getPackageName());
        String name = getString(nameRes);

        // Header
        ((TextView) findViewById(R.id.tvName)).setText(name);

        // Profile photo
        int photoRes = getResources().getIdentifier("dev" + index, "drawable", getPackageName());
        if (photoRes != 0) {
            ((ImageView) findViewById(R.id.profileImage)).setImageResource(photoRes);
        }

        // Control buttons
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
        findViewById(R.id.btnBackBottom).setOnClickListener(v -> finish());
        findViewById(R.id.btnGitHub).setOnClickListener(v -> {
            int githubRes = getResources().getIdentifier(prefix + "_github", "string", getPackageName());
            if (githubRes != 0) {
                openUrl(getString(githubRes));
            } else {
                Toast.makeText(this, "GitHub tidak tersedia", Toast.LENGTH_SHORT).show();
            }
        });

        // Biodata Card
        int alamatRes = getResources().getIdentifier(prefix + "_alamat", "string", getPackageName());
        int bioRes = getResources().getIdentifier(prefix + "_bio", "string", getPackageName());
        ((TextView) findViewById(R.id.tvAlamat)).setText(getString(alamatRes));
        ((TextView) findViewById(R.id.tvDetailContent)).setText(getString(bioRes));

        // Dan Lain Lain: Pendidikan + Aktivitas
        int sdRes = getResources().getIdentifier(prefix + "_sd", "string", getPackageName());
        int smpRes = getResources().getIdentifier(prefix + "_smp", "string", getPackageName());
        int smaRes = getResources().getIdentifier(prefix + "_sma", "string", getPackageName());
        int kuliahRes = getResources().getIdentifier(prefix + "_kuliah", "string", getPackageName());
        int aktivitasRes = getResources().getIdentifier(prefix + "_aktivitas", "string", getPackageName());
        String edu = "\u2022 " + getString(sdRes) + "\n"
                + "\u2022 " + getString(smpRes) + "\n"
                + "\u2022 " + getString(smaRes) + "\n"
                + "\u2022 " + getString(kuliahRes);
        ((TextView) findViewById(R.id.tvEduList)).setText(edu);
        ((TextView) findViewById(R.id.tvAktivitas)).setText(getString(aktivitasRes));

        // Quick Links
        int igRes = getResources().getIdentifier(prefix + "_ig", "string", getPackageName());
        int tiktokRes = getResources().getIdentifier(prefix + "_tiktok", "string", getPackageName());
        String igUrl = igRes != 0 ? getString(igRes) : null;
        String tiktokUrl = tiktokRes != 0 ? getString(tiktokRes) : null;

        findViewById(R.id.btnIG).setOnClickListener(v -> {
            if (igUrl != null) {
                openUrl(igUrl);
            } else {
                Toast.makeText(this, "Instagram tidak tersedia", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnTikTok).setOnClickListener(v -> {
            if (tiktokUrl != null) {
                openUrl(tiktokUrl);
            } else {
                Toast.makeText(this, "TikTok tidak tersedia", Toast.LENGTH_SHORT).show();
            }
        });

        // Clock
        tvClock = findViewById(R.id.tvClock);
        clockHandler = new Handler(Looper.getMainLooper());
        clockRunnable = new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
                tvClock.setText("\uD83D\uDD52  " + sdf.format(new Date()));
                clockHandler.postDelayed(this, 1000);
            }
        };
        clockRunnable.run();
    }

    private void openUrl(String url) {
        try {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Gagal membuka tautan", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (clockHandler != null && clockRunnable != null) {
            clockHandler.removeCallbacks(clockRunnable);
        }
    }
}
