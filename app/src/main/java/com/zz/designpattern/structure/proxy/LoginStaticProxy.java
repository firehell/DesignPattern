package com.zz.designpattern.structure.proxy;

/**
 * @author zhangzhao
 * @date 2021/7/9 10:51 上午
 * @describes
 */
public class LoginStaticProxy implements ILogin{

    private Login login;

    public LoginStaticProxy(Login login) {
        this.login = login;
    }

    @Override
    public void login() {
        int startTime;
        login.login();
        int endTime;
    }

    @Override
    public void register() {
        int startTime;
        login.register();
        int endTime;
    }
}
