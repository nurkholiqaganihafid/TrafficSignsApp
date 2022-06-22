package com.nurkholiq.trafficsignsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.nurkholiq.trafficsignsapp.data.DataSource;
import com.nurkholiq.trafficsignsapp.databinding.ActivityMain2Binding;
import com.nurkholiq.trafficsignsapp.model.Traffic;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding binding;
    static String TAG_TRAFFIC = "TAG_TRAFFIC";
    TrafficAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.barLayoutType2.setNavigationOnClickListener(view -> {
            onBackPressed();
        });

        String type = getIntent().getStringExtra(SignTypeActivity.TAG_TYPE_TRAFFIC);
        if (type != null){
            setupAdapter(type);
        }
    }

    private void setupAdapter(String type) {
        ArrayList<Traffic> listTraffic = new ArrayList();
        if (type.equalsIgnoreCase("peringatan")){
            listTraffic.addAll(DataSource.yellowListTraffic());
            binding.barLayoutType2.setTitle("Rambu Peringatan");
            binding.textView.setText("Sebuah jenis tanda yang mengisyaratkan sebuah bahaya, rintangan atau kondisi potensial yang mengharuskan perhatian khusus.");
        } else if (type.equalsIgnoreCase("larangan")){
            listTraffic.addAll(DataSource.redListTraffic());
            binding.barLayoutType2.setTitle("Rambu Larangan");
            binding.textView.setText("Sebuah jenis tanda yang mengisyaratkan sebuah bahaya, rintangan atau kondisi potensial yang mengharuskan perhatian khusus.");
        } else if (type.equalsIgnoreCase("perintah")){

        } else if (type.equalsIgnoreCase("petunjuk")){

        } else if (type.equalsIgnoreCase("tambahan")){

        } else if (type.equalsIgnoreCase("nomor_rute")){

        }

        mAdapter = new TrafficAdapter(listTraffic);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        binding.rvTraffic.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));
        binding.rvTraffic.setAdapter(mAdapter);
    }
}