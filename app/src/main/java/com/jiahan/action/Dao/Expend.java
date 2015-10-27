package com.jiahan.action.Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "EXPEND".
 * 流水账之-支出
 */
public class Expend {

    private Long id;
    private String time;
    private Double amount;
    private Integer type;
    private String notification;

    public Expend() {
    }

    public Expend(Long id) {
        this.id = id;
    }

    public Expend(Long id, String time, Double amount, Integer type, String notification) {
        this.id = id;
        this.time = time;
        this.amount = amount;
        this.type = type;
        this.notification = notification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

}
