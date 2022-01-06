package com.example.healthyfitness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClassCalfAdapter extends RecyclerView.Adapter <ClassCalfAdapter.ViewHolder> {
    Context context;
    int layout;
    ArrayList<ClassCalf> arrayList;
    public ClassCalfAdapter(Context context, int layout, ArrayList<ClassCalf> arrayList) {
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
        ClassCalf calf = arrayList.get(position);
        holder.ShowHint.setText(calf.getName());
        holder.ShowPic.setImageResource(calf.getPic());
        holder.ShowDirect.setText(calf.getDirect());
        holder.ShowImageDirect.setImageResource(calf.getImageDirect());
        holder.ShowAttention.setText(calf.getAttention());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView ShowHint;
        public ImageView ShowPic;
        public TextView ShowDirect;
        public ImageView ShowImageDirect;
        public TextView ShowAttention;
        public ViewHolder(View v) {
            super(v);
            ShowHint = v.findViewById(R.id.Tips);
            ShowPic = v.findViewById(R.id.Picture);
            ShowDirect = v.findViewById((R.id.Direct));
            ShowImageDirect=v.findViewById(R.id.ImageDirect);
            ShowAttention=v.findViewById(R.id.Attention);
            ShowPic.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {ShowDirect.setVisibility(View.VISIBLE);
                    ShowImageDirect.setVisibility(View.VISIBLE);
                    ShowAttention.setVisibility(View.VISIBLE); }
            });

            ShowHint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                {ShowDirect.setVisibility(View.GONE);
                    ShowAttention.setVisibility(View.GONE);
                    ShowImageDirect.setVisibility(View.GONE); }
            });
        }
    }
}