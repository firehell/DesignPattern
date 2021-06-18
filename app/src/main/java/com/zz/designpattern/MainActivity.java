package com.zz.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zz.designpattern.adapter.MainAdapter;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_rv)
    RecyclerView mRv;

    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        mRv.setLayoutManager(layoutManager);

    }
}