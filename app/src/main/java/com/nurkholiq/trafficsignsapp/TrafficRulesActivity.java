package com.nurkholiq.trafficsignsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

import com.nurkholiq.trafficsignsapp.databinding.ActivityTrafficRulesBinding;

public class TrafficRulesActivity extends AppCompatActivity {

    private ActivityTrafficRulesBinding binding;
    private int collapse = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrafficRulesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutRules;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        binding.expandablePasal278.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal278.expand();
                binding.borderLine2.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal278.collapse();
                binding.borderLine2.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal279.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal279.expand();
                binding.borderLine3.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal279.collapse();
                binding.borderLine3.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal280.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal280.expand();
                binding.borderLine4.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal280.collapse();
                binding.borderLine4.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal281.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal281.expand();
                binding.borderLine5.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal281.collapse();
                binding.borderLine5.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal282.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal282.expand();
                binding.borderLine6.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal282.collapse();
                binding.borderLine6.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal283.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal283.expand();
                binding.borderLine7.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal283.collapse();
                binding.borderLine7.setVisibility(View.VISIBLE);
            }
        });

        binding.expandablePasal284.parentLayout.setOnClickListener(view -> {
            if (collapse == 0) {
                collapse = 1;
                binding.expandablePasal284.expand();
                binding.borderLine8.setVisibility(View.GONE);
            } else {
                collapse = 0;
                binding.expandablePasal284.collapse();
                binding.borderLine8.setVisibility(View.VISIBLE);
            }
        });
    }
}