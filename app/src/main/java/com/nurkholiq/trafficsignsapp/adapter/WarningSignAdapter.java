package com.nurkholiq.trafficsignsapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nurkholiq.trafficsignsapp.R;

public class WarningSignAdapter extends RecyclerView.Adapter<WarningSignAdapter.WarningSignViewHolder> {

    Context context;
    String tille[];
    int images[];

    public WarningSignAdapter(Context context, String title[], int images[]) {
        this.context = context;
        this.tille = title;
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
    public void onBindViewHolder(@NonNull WarningSignViewHolder holder, int position) {
        holder.text1.setText(tille[position]);
        holder.imageView1.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class WarningSignViewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;
        ImageView imageView1, imageView2;

        public WarningSignViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.tv_item1);
            imageView1 = itemView.findViewById(R.id.image1);
//            text2 = itemView.findViewById(R.id.tv_item2);
//            imageView2 = itemView.findViewById(R.id.image2);
        }
    }
}
