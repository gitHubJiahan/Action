package com.jiahan.action.Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "THING".
 * 代办事项
 */
public class Thing {

    private Long id;
    /** Not-null value. */
    private String name;
    private String type;
    private String time;
    private String place;
    private String rank;
    private String notification;
    private Integer tag;
    private String summary;
    private String plan;

    public Thing() {
    }

    public Thing(Long id) {
        this.id = id;
    }

    public Thing(Long id, String name, String type, String time, String place, String rank, String notification, Integer tag, String summary, String plan) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.time = time;
        this.place = place;
        this.rank = rank;
        this.notification = notification;
        this.tag = tag;
        this.summary = summary;
        this.plan = plan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getName() {
        return name;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
