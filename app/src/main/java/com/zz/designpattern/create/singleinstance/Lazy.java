package com.zz.designpattern.create.singleinstance;

/**
 * @author zhangzhao
 * @date 2021/7/4 4:31 下午
 * @describes 懒汉式
 */
public class Lazy {

    private Lazy(){

    }

    private static Lazy instance;

    public static Lazy getInstance() {
        if (instance == null) {
            synchronized (Lazy.class) {
                instance = new Lazy();
            }
        }
        return instance;
    }
}
