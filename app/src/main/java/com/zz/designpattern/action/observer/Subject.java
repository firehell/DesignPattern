package com.zz.designpattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhao
 * @date 2021/7/29 6:00 下午
 * @describes
 */
public class Subject {
    List<Observer> data = new ArrayList<>();

    public void regist(Observer observer) {
        data.add(observer);
    }

    public void notifyAllUpdate() {
        for (int i = 0; i < data.size(); i++) {
            data.get(i).notifyUpdate();
        }
    }
}
