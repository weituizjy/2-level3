package com.example.level3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.InnerHolder> {
    private ArrayList<text> data;

    public adapter(ArrayList<text> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public adapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.InnerHolder holder, int position) {
//        text data=date.get(position);
        holder.tvBig.setText(data.get(position).getBig());
        holder.tvGuo.setText(data.get(position).getGuo());
        holder.tvRed.setText(data.get(position).getRed());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder{
        private TextView tvBig;
        private TextView tvGuo;
        private TextView tvRed;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvBig=(TextView) itemView.findViewById(R.id.tv_big);
            tvGuo=(TextView) itemView.findViewById(R.id.tv_guo);
            tvRed=(TextView) itemView.findViewById(R.id.tv_red);
        }
    }
}
