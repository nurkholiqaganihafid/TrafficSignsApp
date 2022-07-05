package com.nurkholiq.trafficsignsapp.signtype.hintsign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.adapter.SignTypeAdapter;
import com.nurkholiq.trafficsignsapp.databinding.ActivityHintSignBinding;

public class HintSignActivity extends AppCompatActivity {

    private ActivityHintSignBinding binding;

    String title[], desription[];
    // TODO: image belum sesuai dengan rambu petunjuk
    int images[] = {R.drawable.rl_1_stop, R.drawable.rl_2_entry, R.drawable.rl_3_left, R.drawable.rl_4_right, R.drawable.rl_5_u_turn, R.drawable.rl_6_parking, R.drawable.rl_7_pedestrian, R.drawable.rl_8_4wheels};
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

        SignTypeAdapter warningSignAdapter = new SignTypeAdapter(this, title, desription, images);
        binding.recyclerviewHintSign.setAdapter(warningSignAdapter);
        layoutManager = new GridLayoutManager(this, 2);
        binding.recyclerviewHintSign.setLayoutManager(layoutManager);

    }
}