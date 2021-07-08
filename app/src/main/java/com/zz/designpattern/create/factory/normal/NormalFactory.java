package com.zz.designpattern.create.factory.normal;

import com.zz.designpattern.create.factory.sample.IConfigParser;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:42 上午
 * @describes
 */
public class NormalFactory {

    IConfigParserFactory factory = null;
    public void getParser(int type){
        factory = ConfigParserFactoryMap.getFactory(type);
        IConfigParser parser = factory.create();
    }
}
