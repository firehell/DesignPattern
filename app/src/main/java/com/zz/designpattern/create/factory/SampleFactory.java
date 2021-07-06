package com.zz.designpattern.create.factory;

/**
 * @author zhangzhao
 * @date 2021/7/5 6:29 下午
 * @describes
 */
public class SampleFactory {

    public static IConfigParser createParser(int type) {
        if (type == 1) {
//            return new TestParser();
        }
        return null;
    }
}
