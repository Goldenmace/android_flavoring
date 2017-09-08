package com.gmits.flavors;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vhpatoliya on 07,March,2017.
 * GoldenMace IT Solutions
 */
public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private List<String> mItemTitle;

    public RecycleAdapter(List<String> aItemTitle) {
        this.mItemTitle = aItemTitle;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle_list, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.itemTitle.setText(mItemTitle.get(i));
    }

    @Override
    public int getItemCount() {
        return mItemTitle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;

        public ViewHolder(View v) {
            super(v);
            itemTitle = v.findViewById(R.id.txtItem);
        }
    }
}