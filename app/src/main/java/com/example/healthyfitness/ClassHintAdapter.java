package com.example.healthyfitness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassHintAdapter extends RecyclerView.Adapter <ClassHintAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<ClassHint> arrayList;
    public ClassHintAdapter(Context context, int layout, ArrayList<ClassHint> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ClassHint hint = arrayList.get(position);
        holder.ShowHint.setText(hint.getName());
        holder.ShowPic.setImageResource(hint.getPic());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ShowHint;
        public ImageView ShowPic;

        public ViewHolder(View v) {
            super(v);
            ShowHint = v.findViewById(R.id.Tips);
            ShowPic = v.findViewById(R.id.Picture);
        }
    }

}