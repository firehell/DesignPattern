package com.zz.designpattern.create.builder;

import android.text.TextUtils;

/**
 * @author zhangzhao
 * @date 2021/7/6 5:30 下午
 * @describes 建造者模式
 */
public class User {

    private String name;
    private String sex;
    private long phone;
    private String address;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public static class UserBuilder {
        private String name;
        private String sex;
        private long phone;
        private String address;

        public User build() {
            if (TextUtils.isEmpty(name)) {
                throw new IllegalArgumentException("");
            }
            if (TextUtils.isEmpty(sex)) {
                throw new IllegalArgumentException("");
            }
            if (TextUtils.isEmpty(address)) {
                throw new IllegalArgumentException("");
            }
            return new User(this);
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
    }
}
