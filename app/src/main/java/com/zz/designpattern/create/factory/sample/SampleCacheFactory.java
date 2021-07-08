package com.zz.designpattern.create.factory.sample;

import java.util.HashMap;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:39 上午
 * @describes
 */
public class SampleCacheFactory {

    private static final HashMap<Integer, IConfigParser> cache = new HashMap<>();

    static {
        cache.put(1, new ConfigA());
        cache.put(2, new ConfigB());
        cache.put(3, new ConfigC());
    }

    public static IConfigParser createParser(int type) {
        return cache.get(type);
    }
}
