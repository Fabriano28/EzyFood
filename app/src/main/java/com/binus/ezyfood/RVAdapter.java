package com.binus.ezyfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Holder> {
    List<String> item;
    LayoutInflater inflater;

    public RVAdapter(Context context, List<String> item) {
        this.item = item;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.itemview, parent, false);
        return  new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.textdata.setText(item.get(position));
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        TextView textdata;
        public Holder(@NonNull View itemView) {
            super(itemView);

            textdata = itemView.findViewById(R.id.itemtext);
        }
    }
}
