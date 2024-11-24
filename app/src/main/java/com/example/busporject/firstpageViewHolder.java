package com.example.busporject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class firstpageViewHolder extends RecyclerView.ViewHolder {

   private TextView intial,destination;

    public TextView getIntial() {
        return intial;
    }

    public void setIntial(TextView intial) {
        this.intial = intial;
    }

    public TextView getDestination() {
        return destination;
    }

    public void setDestination(TextView destination) {
        this.destination = destination;
    }

    public firstpageViewHolder(@NonNull View itemView) {
        super(itemView);

        intial=itemView.findViewById(R.id.Value1);
        destination=itemView.findViewById(R.id.value2);
    }
}
