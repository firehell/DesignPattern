package com.zz.designpattern.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zz.designpattern.R;

/**
 * @author zhangzhao
 * @date 2021/6/18 10:59 上午
 * @describes
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MainViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {

        Button btn;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.item_main_btn);
        }
    }
}
