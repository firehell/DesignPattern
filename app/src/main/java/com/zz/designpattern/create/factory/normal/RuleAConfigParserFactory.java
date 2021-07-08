package com.zz.designpattern.create.factory.normal;

import com.zz.designpattern.create.factory.sample.ConfigA;
import com.zz.designpattern.create.factory.sample.IConfigParser;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:44 上午
 * @describes
 */
public class RuleAConfigParserFactory implements IConfigParserFactory {
    @Override
    public IConfigParser create() {
        return new ConfigA();
    }
}
