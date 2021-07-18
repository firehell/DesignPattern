package com.zz.designpattern.structure.bridge;

/**
 * @author zhangzhao
 * @date 2021/7/18 8:17 下午
 * @describes
 */
public class UrgencyNotify extends Notification{
    /**
     * 这一步通过组合的方式把"抽象"和"实现"联系起来
     *
     * @param msgSender
     */
    public UrgencyNotify(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

    }
}
