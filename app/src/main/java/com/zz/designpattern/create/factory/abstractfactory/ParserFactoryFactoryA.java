package com.zz.designpattern.create.factory.abstractfactory;

/**
 * @author zhangzhao
 * @date 2021/7/8 1:29 下午
 * @describes 实现抽象工厂的子类直接实现抽象工厂中的分类工厂创建
 */
public class ParserFactoryFactoryA implements IParserFactory {

    @Override
    public ISystemParser createSystemParser() {
        return null;
    }

    @Override
    public IRuleParser createRuleParser() {
        return new JsonRuleParser();
    }
}
