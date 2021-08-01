package com.zz.designpattern.action.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangzhao
 * @date 2021/8/1 7:06 下午
 * @describes
 */
public class StrategyFactory {

    private static Map<String, IRuleConfig> data = new HashMap();

    static {
        data.put("apple", new AppleConfig());
        data.put("banana", new BananaConfig());
    }

    public static IRuleConfig getConfig(String key) {
        return data.get(key);
    }
}
