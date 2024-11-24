package com.example.busporject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class firstpageAddapter extends RecyclerView.Adapter<firstpageViewHolder> {

private List<dataModel> data;
private Context context;

    public firstpageAddapter(List<dataModel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public firstpageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new firstpageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.firstpagelayout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull firstpageViewHolder holder, int position) {
       holder.getIntial().setText(data.get(position).getInitial());
       holder.getDestination().setText(data.get(position).getDestination());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
