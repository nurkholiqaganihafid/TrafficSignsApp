package com.nurkholiq.trafficsignsapp.signtype.additionalboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.adapter.SignTypeAdapter;
import com.nurkholiq.trafficsignsapp.databinding.ActivityAdditionalBoardBinding;

public class AdditionalBoardActivity extends AppCompatActivity {

    private ActivityAdditionalBoardBinding binding;

    String title[], desription[];
    // TODO: image belum sesuai dengan papan tambahan
    int images[] = {R.drawable.rp_1_left, R.drawable.rp_2_right, R.drawable.rp_3_sharp_left, R.drawable.rp_4_sharp_right, R.drawable.rp_5_left_bend, R.drawable.rp_6_right_bend, R.drawable.rp_7_climb, R.drawable.rp_8_traffic_lights};
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdditionalBoardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.barLayoutDescription;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbar.setNavigationOnClickListener(view -> finish());

        title = getResources().getStringArray(R.array.additional_board_title);
        desription = getResources().getStringArray(R.array.additional_board_description);

        SignTypeAdapter warningSignAdapter = new SignTypeAdapter(this, title, desription, images);
        binding.recyclerviewAdditionalBoard.setAdapter(warningSignAdapter);
        layoutManager = new GridLayoutManager(this, 2);
        binding.recyclerviewAdditionalBoard.setLayoutManager(layoutManager);

    }
}