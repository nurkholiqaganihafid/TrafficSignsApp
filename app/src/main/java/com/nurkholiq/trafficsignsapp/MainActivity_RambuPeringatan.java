package com.nurkholiq.trafficsignsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.nurkholiq.trafficsignsapp.databinding.ActivityMainRambuPeringatanBinding;
import com.nurkholiq.trafficsignsapp.model.Traffic;

public class MainActivity_RambuPeringatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainRambuPeringatanBinding binding = ActivityMainRambuPeringatanBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.barLayoutType3.setNavigationOnClickListener(view -> {
            onBackPressed();
        });

        Traffic traffic = getIntent().getParcelableExtra(MainActivity2.TAG_TRAFFIC);
        if (traffic != null) {
            binding.imageView.setImageResource(traffic.getImage());
            binding.textView2.setText(traffic.getName());
            binding.textView4.setText(traffic.getDesc());
        }
    }
}