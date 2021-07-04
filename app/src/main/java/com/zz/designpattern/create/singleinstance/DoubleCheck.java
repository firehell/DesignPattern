package com.zz.designpattern.create.singleinstance;

/**
 * @author zhangzhao
 * @date 2021/7/4 4:58 下午
 * @describes 双重校验锁
 */
public class DoubleCheck {

    private DoubleCheck() {
    }

    private static volatile DoubleCheck instance;

    public static DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
