package com.zz.designpattern.create.singleinstance;

/**
 * @author zhangzhao
 * @date 2021/7/4 4:31 下午
 * @describes 懒汉式
 */
public class LazySingleInstance {

    private LazySingleInstance(){

    }

    private static LazySingleInstance instance;

    public static LazySingleInstance getInstance() {
        if (instance == null) {
            synchronized (LazySingleInstance.class) {
                instance = new LazySingleInstance();
            }
        }
        return instance;
    }
}
