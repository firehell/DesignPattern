package com.zz.designpattern.structure.decorator;

/**
 * @author zhangzhao
 * @date 2021/7/28 10:07 上午
 * @describes
 */
public class Decortator {

    public static void main(String[] args) {
        IDecorator d = new ADecorator(new A());
    }
}
