package com.zz.designpattern.create.singleinstance;

/**
 * @author zhangzhao
 * @date 2021/7/4 3:15 下午
 * @describes 饿汉式
 * 如果很耗费资源，可以考虑使用这个来把过程提前，而不是等到使用的的时候再加载
 * 如果有OOM的问题这样也可以提早暴露出来
 */
public class Hungry {

    private static Hungry INSANCE = new Hungry();

    private Hungry() {

    }

    public static Hungry getInstance() {
        return INSANCE;
    }
}
