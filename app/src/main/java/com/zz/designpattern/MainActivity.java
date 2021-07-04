package com.zz.designpattern;

import android.app.ActionBar;
import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zz.designpattern.adapter.MainAdapter;
import com.zz.designpattern.create.SingleInstance;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 首页
 *
 * @author zz
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.main_rv)
    RecyclerView mRv;

    private MainAdapter mAdapter;
    private List<String> mData = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void doInitView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRv.setLayoutManager(layoutManager);
        mAdapter = new MainAdapter();
        mRv.setAdapter(mAdapter);
    }

    @Override
    protected void doInitData() {
        mData.add("单例模式");
        mData.add("工厂模式");
        mData.add("建造者模式");
        mData.add("原型模式");
        if (mAdapter != null) {
            mAdapter.renderView(mData);
        }
    }

    @Override
    protected void doListener() {
        if (mAdapter != null) {
            mAdapter.setOnAdapterClick(new MainAdapter.OnAdapterClick() {
                @Override
                public void onItemClick(int position) {
                    Intent intent = new Intent();
                    switch (position) {
                        case 0:
                            intent.setClass(MainActivity.this, SingleInstance.class);
                            startActivity(intent);
                            break;
                        default:
                            break;
                    }
                }
            });
        }
    }
}