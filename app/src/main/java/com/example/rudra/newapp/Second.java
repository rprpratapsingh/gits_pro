package com.example.rudra.newapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Second extends RecyclerView.Adapter<Second.MyViewHolder> {
    private String[]  mDataset;
    public Second(String[] mDataset){
        this.mDataset = mDataset;
    }

    @Override
    public Second.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.second,viewGroup,false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Second.MyViewHolder myViewHolder, int i) {
        myViewHolder.tvtext.setText(mDataset[i]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder {
        public TextView tvtext;
        public MyViewHolder(View v) {
        super(v);
        tvtext = (TextView) v.findViewById(R.id.tv_text);
        }
    }
}
