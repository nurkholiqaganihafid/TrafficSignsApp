package com.nurkholiq.trafficsignsapp.signtype.commandsign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.adapter.SignTypeAdapter;
import com.nurkholiq.trafficsignsapp.databinding.ActivityCommandSignBinding;

public class CommandSignActivity extends AppCompatActivity {

    private ActivityCommandSignBinding binding;

    String title[], desription[];
    int images[] = {R.drawable.rw_1_left, R.drawable.rw_2_right, R.drawable.rw_3_follow_directions, R.drawable.rw_4_follow_directions, R.drawable.rw_5_skipped, R.drawable.rw_6_skipped, R.drawable.rw_7_bicycle, R.drawable.rw_8_roundabout};
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCommandSignBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        title = getResources().getStringArray(R.array.command_sign_title);
        desription = getResources().getStringArray(R.array.command_sign_description);

        SignTypeAdapter warningSignAdapter = new SignTypeAdapter(this, title, desription, images);
        binding.recyclerviewCommandSign.setAdapter(warningSignAdapter);
        layoutManager = new GridLayoutManager(this, 2);
        binding.recyclerviewCommandSign.setLayoutManager(layoutManager);

    }
}