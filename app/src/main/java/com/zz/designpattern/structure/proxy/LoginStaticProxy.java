package com.zz.designpattern.structure.proxy;

/**
 * @author zhangzhao
 * @date 2021/7/9 10:51 上午
 * @describes 静态代理，分成两种一种是写一个接口，原始类和代理类都继承同一个接口，然后代理类通过组合的方式，
 * 持有原始类，来实现代理。第二种通过代理类继承原始类的方式，用在代理第三方库等场景
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
