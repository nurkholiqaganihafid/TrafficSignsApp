package com.nurkholiq.trafficsignsapp.warningsign;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nurkholiq.trafficsignsapp.databinding.ActivityDescWarningSignBinding;

public class DescWarningSignActivity extends AppCompatActivity {

    String title, description;
    int myImage;

    private ActivityDescWarningSignBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescWarningSignBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        getData();
        setData();
    }

    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("title") && getIntent().hasExtra("description")) {
            title = getIntent().getStringExtra("title");
            description = getIntent().getStringExtra("description");
            myImage = getIntent().getIntExtra("myImage", 1);
        } else {
            Toast.makeText(this, "Tidak ada item", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        binding.tvItem1.setText(title);
        binding.descriptionTitle.setText(description);
        binding.image1.setImageResource(myImage);
    }
}