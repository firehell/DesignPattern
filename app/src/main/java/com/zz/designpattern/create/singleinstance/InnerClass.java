package com.zz.designpattern.create.singleinstance;

/**
 * @author zhangzhao
 * @date 2021/7/4 5:00 下午
 * @describes 静态内部类，通过利用jvm的类加载机制来实现单例功能
 */
public class InnerClass {
    private InnerClass() {
    }

    private static class SingletonHolder {
        private static final InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance() {
        return SingletonHolder.instance;
    }
}
