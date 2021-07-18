package com.zz.designpattern.structure.bridge;

/**
 * @author zhangzhao
 * @date 2021/7/18 8:15 下午
 * @describes
 */
public abstract class Notification {
    private MsgSender msgSender;

    public abstract void notify(String message);
    /**
     * 这一步通过组合的方式把"抽象"和"实现"联系起来
     * @param msgSender
     */
    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }
}
