package com.zz.designpattern.create.factory.abstractfactory;

/**
 * @author zhangzhao
 * @date 2021/7/8 1:35 下午
 * @describes 抽象工厂
 */
public class Use {

    public static void main(String[] args) {
        IRuleParser parser = new ParserFactoryFactoryB().createRuleParser();
    }
}
