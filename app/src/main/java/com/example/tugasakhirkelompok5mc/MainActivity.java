package com.example.tugasakhirkelompok5mc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.btnDev1).setOnClickListener(v -> openDeveloper(1));
        findViewById(R.id.btnDev2).setOnClickListener(v -> openDeveloper(2));
        findViewById(R.id.btnDev3).setOnClickListener(v -> openDeveloper(3));
        findViewById(R.id.btnInstagram).setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.class_ig)));
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this, "Gagal membuka Instagram", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btnExit).setOnClickListener(v -> finishAffinity());
    }

    private void openDeveloper(int index) {
        Intent intent = new Intent(this, DeveloperDetailActivity.class);
        intent.putExtra("developer_index", index);
        startActivity(intent);
    }
}
