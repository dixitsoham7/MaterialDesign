package com.srm.sohamdixit.materialdesign;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Soham Dixit on 01-05-2018.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.VersionViewHolder>{

    public class VersionViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView version;

        VersionViewHolder(View view){
            super(view);
            cv=view.findViewById(R.id.cv);
            version=view.findViewById(R.id.version);
        }
    }

    List<Adapter> android;
    RVAdapter(List<Adapter> android){
        this.android = android;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        VersionViewHolder vh = new VersionViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(VersionViewHolder holder, int position) {
        holder.version.setText(android.get(position).versions);
    }

    @Override
    public int getItemCount() {
        return android.size();
    }
}
