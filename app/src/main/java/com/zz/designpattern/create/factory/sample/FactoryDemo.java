package com.zz.designpattern.create.factory.sample;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:35 上午
 * @describes
 */
public class FactoryDemo {

    public static void main(String[] args) {
        IConfigParser parser = SampleFactory.createParser(1);
        parser.create();
    }
}
