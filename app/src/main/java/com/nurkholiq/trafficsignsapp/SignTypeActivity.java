package com.nurkholiq.trafficsignsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.databinding.ActivitySignTypeBinding;

public class SignTypeActivity extends AppCompatActivity {

    static String TAG_TYPE_TRAFFIC = "TAG_TYPE_TRAFFIC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.nurkholiq.trafficsignsapp.databinding.ActivitySignTypeBinding binding = ActivitySignTypeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutType;
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(view -> finish());

        binding.btnWarningSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "peringatan");
            startActivity(moveIntent);
        });

        binding.btnProhibitionSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "larangan");
            startActivity(moveIntent);
        });

        binding.btnCommandSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "perintah");
            startActivity(moveIntent);
        });

        binding.btnHintSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "petunjuk");
            startActivity(moveIntent);
        });

        binding.btnAdditionalBoard.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "tambahan");
            startActivity(moveIntent);
        });

        binding.btnRouteSign.setOnClickListener(view -> {
            Intent moveIntent = new Intent(getApplicationContext(), MainActivity2.class);
            moveIntent.putExtra(TAG_TYPE_TRAFFIC, "nomor_rute");
            startActivity(moveIntent);
        });

    }
}