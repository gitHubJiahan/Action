package com.jiahan.action.Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "Coffer".
 * 我的小金库
 */
public class Coffer {

    private Double money;
    private Integer password;

    public Coffer() {
    }

    public Coffer(Double money, Integer password) {
        this.money = money;
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

}
