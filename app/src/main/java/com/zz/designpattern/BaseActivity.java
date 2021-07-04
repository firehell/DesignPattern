package com.zz.designpattern;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * @author zhangzhao
 * @date 2021/7/4 12:50 下午
 * @describes
 */
public abstract class BaseActivity extends AppCompatActivity {

    /**
     * 设置布局id
     * @return 布局id
     */
    protected abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        doInitView();
        doInitData();
        doListener();
    }

    protected void doInitView(){

    }

    protected void doInitData(){

    }

    protected void doListener(){

    }
}
