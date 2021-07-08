package com.zz.designpattern.create.factory.normal;

import java.util.HashMap;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:51 上午
 * @describes
 */
public class ConfigParserFactoryMap {

    private static final HashMap<Integer, IConfigParserFactory> cache = new HashMap<>();

    static {
        cache.put(1, new RuleAConfigParserFactory());
        cache.put(1, new RuleBConfigParserFactory());
        cache.put(1, new RuleCConfigParserFactory());
    }

    public static IConfigParserFactory getFactory(int type) {
        return cache.get(type);
    }
}
