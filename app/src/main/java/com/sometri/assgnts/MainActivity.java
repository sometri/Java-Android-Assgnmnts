package com.sometri.assgnts;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    String msg = "";
    ImageView image1;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.status_bar_color));

        image1 = findViewById(R.id.mainHomework1);
        image2 = findViewById(R.id.mainHomework2);

        image1.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, EventHandlerActivity.class);
            startActivity(i);
        });

        image2.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, ExchangeRateActivity.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
}
