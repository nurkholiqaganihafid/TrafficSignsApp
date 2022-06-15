package com.nurkholiq.trafficsignsapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.warningsign.DescWarningSignActivity;

public class WarningSignAdapter extends RecyclerView.Adapter<WarningSignAdapter.WarningSignViewHolder> {

    Context context;
    String tille[], description[];
    int images[];

    public WarningSignAdapter(Context context, String title[], String description[], int images[]) {
        this.context = context;
        this.tille = title;
        this.description = description;
        this.images = images;
    }

    @NonNull
    @Override
    public WarningSignViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_warning_sign, parent, false);
        return new WarningSignViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WarningSignViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.text1.setText(tille[position]);
        holder.text2.setText(description[position]);
        holder.imageView1.setImageResource(images[position]);

        holder.itemWarningLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(context, DescWarningSignActivity.class);
                moveIntent.putExtra("title", tille[position]);
                moveIntent.putExtra("description", description[position]);
                moveIntent.putExtra("myImage", images[position]);
                context.startActivity(moveIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class WarningSignViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;
        ImageView imageView1;
        LinearLayout itemWarningLayout;

        public WarningSignViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.tv_item1);
            imageView1 = itemView.findViewById(R.id.image1);
            text2 = itemView.findViewById(R.id.tv_description1);
            itemWarningLayout = itemView.findViewById(R.id.item_warning_layout);
        }
    }
}
