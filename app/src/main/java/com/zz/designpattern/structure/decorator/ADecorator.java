package com.zz.designpattern.structure.decorator;

/**
 * @author zhangzhao
 * @date 2021/7/22 4:34 下午
 * @describes
 */
public class ADecorator implements IDecorator{

    private IDecorator iDecorator;

    public ADecorator(IDecorator iDecorator) {
        this.iDecorator = iDecorator;
    }

    @Override
    public void f() {
        //装饰器功能增强代码
        iDecorator.f();
        //装饰器功能增强代码
    }
}
