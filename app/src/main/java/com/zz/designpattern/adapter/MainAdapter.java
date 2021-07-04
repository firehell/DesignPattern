package com.zz.designpattern.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zz.designpattern.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhao
 * @date 2021/6/18 10:59 上午
 * @describes
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private OnAdapterClick mOnAdapterClick;
    private List<String> mData = new ArrayList<>();

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MainViewHolder holder, int position) {
        holder.btn.setText(TextUtils.isEmpty(mData.get(position)) ? "" : mData.get(position));
        if (mOnAdapterClick != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mOnAdapterClick.onItemClick(position);
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public interface OnAdapterClick {
        void onItemClick(int position);
    }

    public void setOnAdapterClick(OnAdapterClick mOnAdapterClick) {
        this.mOnAdapterClick = mOnAdapterClick;
    }

    public void renderView(List<String> data) {
        this.mData.clear();
        this.mData.addAll(data);
        notifyDataSetChanged();
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView btn;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.item_main_btn);
        }
    }
}
