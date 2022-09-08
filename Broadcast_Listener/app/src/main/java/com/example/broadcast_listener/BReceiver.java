package com.example.broadcast_listener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class BReceiver extends AppCompatActivity {
        private BroadcastReceiver broad = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                ProgressBar pb=findViewById(R.id.pb_output);
                int level =intent.getIntExtra("level",0);
                pb.setProgress(50);
                TextView tv = findViewById(R.id.tv_output);
                tv.setText("Battery Level "+ 50);
            }
        };
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_breceiver);
            registerReceiver(broad,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));

        }
}