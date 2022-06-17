package com.nurkholiq.trafficsignsapp.signtype.prohibitionsign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nurkholiq.trafficsignsapp.databinding.ActivityDescProhibitionSignBinding;

public class DescProhibitionSignActivity extends AppCompatActivity {

    private ActivityDescProhibitionSignBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescProhibitionSignBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

    }
}