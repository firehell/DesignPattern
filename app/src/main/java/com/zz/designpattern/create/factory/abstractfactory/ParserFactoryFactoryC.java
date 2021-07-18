package com.zz.designpattern.create.factory.abstractfactory;

/**
 * @author zhangzhao
 * @date 2021/7/8 1:29 下午
 * @describes
 */
public class ParserFactoryFactoryC implements IParserFactory {

    @Override
    public ISystemParser createSystemParser() {
        return null;
    }

    @Override
    public IRuleParser createRuleParser() {
        return null;
    }
}
