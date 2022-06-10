package com.nurkholiq.trafficsignsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.databinding.ActivitySignTypeBinding;

public class SignTypeActivity extends AppCompatActivity {

    private ActivitySignTypeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignTypeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutType;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        binding.btnWarningSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), WarningSignActivity.class);
            startActivity(moveIntent);
        });

        binding.btnProhibitionSign.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

        binding.btnCommandSign.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

        binding.btnHintSign.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

        binding.btnAdditionalBoard.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

        binding.btnRouteSign.setOnClickListener(view -> {
            // TODO : moveIntent Activity or Fragment
        });

    }
}