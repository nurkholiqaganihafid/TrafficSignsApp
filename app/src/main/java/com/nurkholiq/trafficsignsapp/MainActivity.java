package com.nurkholiq.trafficsignsapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nurkholiq.trafficsignsapp.databinding.ActivityMainBinding;
import com.nurkholiq.trafficsignsapp.games.GameActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSignType.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), SignTypeActivity.class);
            startActivity(moveIntent);
        });

        binding.btnRule.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), TrafficRulesActivity.class);
            startActivity(moveIntent);
        });

        binding.btnGames.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), GameActivity.class);
            startActivity(moveIntent);
        });

//        binding.btnScan.setOnClickListener(view -> {
//            // TODO : moveIntent Activity or Fragment
//        });

        binding.btnExit.setOnClickListener(view -> {
            onBackPressed();
        });

    }
}