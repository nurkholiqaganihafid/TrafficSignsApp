package com.nurkholiq.trafficsignsapp.games;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.nurkholiq.trafficsignsapp.R;

public class ResultActivity extends AppCompatActivity {

    public static String RESULT_TAG = "RESULT_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String result = getIntent().getStringExtra(RESULT_TAG);
        TextView resultTv = findViewById(R.id.result);
        resultTv.setText("Nilai: " + result);
        findViewById(R.id.back).setOnClickListener(view ->  finish());
    }
}