package com.zz.designpattern.create.factory.abstractfactory;

/**
 * @author zhangzhao
 * @date 2021/7/8 1:28 下午
 * @describes
 */
public interface IParser {
    ISystemParser createSystemParser();

    IRuleParser creasteRuleParser();
}
