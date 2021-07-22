package com.zz.designpattern.structure.adapter;

/**
 * @author zhangzhao
 * @date 2021/7/22 5:18 下午
 * @describes
 */
public class AdapterClass extends Adaptee implements ITarget{

    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}
