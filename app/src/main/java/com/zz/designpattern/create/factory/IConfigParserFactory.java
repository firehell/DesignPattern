package com.zz.designpattern.create.factory;

import com.zz.designpattern.create.factory.sample.IConfigParser;

/**
 * @author zhangzhao
 * @date 2021/7/8 11:43 上午
 * @describes
 */
interface IConfigParserFactory {

    IConfigParser create();
}
