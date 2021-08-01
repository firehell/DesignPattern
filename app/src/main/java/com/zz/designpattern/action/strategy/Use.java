package com.zz.designpattern.action.strategy;

/**
 * @author zhangzhao
 * @date 2021/8/1 7:12 下午
 * @describes
 */
public class Use {

    public static void main(String[] args) {
        String type = "apple";
        StrategyFactory.getConfig(type).update();
    }
}
