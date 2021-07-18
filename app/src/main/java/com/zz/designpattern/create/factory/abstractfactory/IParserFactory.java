package com.zz.designpattern.create.factory.abstractfactory;

/**
 * @author zhangzhao
 * @date 2021/7/8 1:28 下午
 * @describes 这就是一个抽象工厂类的接口
 */
public interface IParserFactory {
    /**
     * 按照系统分类
     */
    ISystemParser createSystemParser();

    /**
     * 按照规则分类
     */
    IRuleParser createRuleParser();
}
