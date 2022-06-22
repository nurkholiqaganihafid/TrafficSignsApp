package com.nurkholiq.trafficsignsapp;

import static com.nurkholiq.trafficsignsapp.MainActivity2.TAG_TRAFFIC;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.nurkholiq.trafficsignsapp.model.Traffic;

import java.util.List;


public class TrafficAdapter extends RecyclerView.Adapter<TrafficAdapter.ViewHolder> {

    private List<Traffic> listTraffic;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.image);
        }

        public void bind(Traffic traffic) {
            imageView.setImageResource(traffic.getImage());
            imageView.setOnClickListener(view -> {
                Intent intent = new Intent(itemView.getContext(), MainActivity_RambuPeringatan.class);
                intent.putExtra(TAG_TRAFFIC, traffic);
                itemView.getContext().startActivity(intent);
            });
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView.
     */
    public TrafficAdapter(List<Traffic> dataSet) {
        listTraffic = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_traffic, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.bind(listTraffic.get(position));
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return listTraffic.size();
    }
}

