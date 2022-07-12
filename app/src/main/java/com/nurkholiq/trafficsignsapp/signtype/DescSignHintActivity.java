package com.nurkholiq.trafficsignsapp.signtype;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nurkholiq.trafficsignsapp.databinding.ActivityDescSignHintBinding;
import com.nurkholiq.trafficsignsapp.databinding.ActivityDescSignTypeBinding;

public class DescSignHintActivity extends AppCompatActivity implements View.OnClickListener {

    String title, description;
    int myImage;

    private ActivityDescSignHintBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescSignHintBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        binding.next.setOnClickListener(this);
        binding.previous.setOnClickListener(this);

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

    @Override
    public void onClick(View view) {
        if (view == binding.next) {
            Toast.makeText(this, "Belum ada aktifitas", Toast.LENGTH_SHORT).show();
//            binding.vfDesc.showNext();
        } else if (view == binding.previous) {
            Toast.makeText(this, "Belum ada aktifitas", Toast.LENGTH_SHORT).show();
//            binding.vfDesc.showPrevious();
        }
    }
}