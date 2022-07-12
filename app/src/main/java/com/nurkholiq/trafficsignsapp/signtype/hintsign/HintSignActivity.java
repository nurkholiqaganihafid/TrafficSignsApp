package com.nurkholiq.trafficsignsapp.signtype.hintsign;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.adapter.SignHintAdapter;
import com.nurkholiq.trafficsignsapp.databinding.ActivityHintSignBinding;

public class HintSignActivity extends AppCompatActivity {

    private ActivityHintSignBinding binding;

    String title[], desription[];
    int images[] = {R.drawable.pet_1_intersection, R.drawable.pet_2_region, R.drawable.pet_3_exit, R.drawable.pet_4_left, R.drawable.pet_5_right, R.drawable.pet_6_purwakarta};
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHintSignBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        title = getResources().getStringArray(R.array.hint_sign_title);
        desription = getResources().getStringArray(R.array.hint_sign_description);

        SignHintAdapter hintSignAdapter = new SignHintAdapter(this, title, desription, images);
        binding.recyclerviewHintSign.setAdapter(hintSignAdapter);
        layoutManager = new GridLayoutManager(this, 2);
        binding.recyclerviewHintSign.setLayoutManager(layoutManager);

    }
}