package com.zz.designpattern.create.factory;


import com.zz.designpattern.create.factory.sample.ConfigB;
import com.zz.designpattern.create.factory.sample.IConfigParser;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:44 上午
 * @describes
 */
public class RuleBConfigParserFactory implements IConfigParserFactory {
    @Override
    public IConfigParser create() {
        return new ConfigB();
    }
}
