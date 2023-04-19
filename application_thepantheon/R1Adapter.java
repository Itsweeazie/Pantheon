package com.example.application_thepantheon;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class R1Adapter extends RecyclerView.Adapter<R1Adapter.R1ViewHolder> {

    private ArrayList<Item> items;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        onItemClickListener = listener;
    }

    public static class R1ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView1;
        public TextView textView2;

        public R1ViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.titre);
            textView2 = itemView.findViewById(R.id.description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public R1Adapter(ArrayList<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public R1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        R1ViewHolder evh = new R1ViewHolder(v, onItemClickListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull R1ViewHolder holder, int position) {
        Item currentItem = items.get(position);

        holder.textView1.setText(currentItem.getName());
        holder.textView2.setText(currentItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}