package com.zz.designpattern.structure.adapter;

/**
 * @author zhangzhao
 * @date 2021/7/22 5:18 下午
 * @describes
 */
public class AdapterInterface implements ITarget{

    private Adaptee adaptee;

    public AdapterInterface(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();
    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}
