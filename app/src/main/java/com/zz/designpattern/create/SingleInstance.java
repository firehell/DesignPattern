package com.zz.designpattern.create;

import com.zz.designpattern.BaseActivity;
import com.zz.designpattern.R;

/**
 * @author zhangzhao
 * @date 2021/7/4 1:43 下午
 * @describesc 1. 避免资源访问冲突 2. 业务概念上的全局唯一类
 */
public class SingleInstance extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_single_instance;
    }
}
