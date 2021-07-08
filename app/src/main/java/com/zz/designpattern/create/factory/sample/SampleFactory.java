package com.zz.designpattern.create.factory.sample;

/**
 * @author zhangzhao
 * @date 2021/7/5 6:29 下午
 * @describes 简单工厂模式
 */
public class SampleFactory {

    public static IConfigParser createParser(int type) {
        if (type == 1) {
            return new ConfigA();
        } else if (type == 2) {
            return new ConfigB();
        } else {
            return new ConfigC();
        }
    }
}
