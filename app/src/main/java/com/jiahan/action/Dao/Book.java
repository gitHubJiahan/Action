package com.jiahan.action.Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "BOOK".
 */
public class Book {

    private Long id;
    /** Not-null value. */
    private String bookName;
    private String StringURL;
    private String author;
    private String language;
    private String introduction;
    private String addTime;
    private Integer type;
    private String plane;
    private Integer readProgress;
    private Integer tag;
    private String finish;
    private String timeline;

    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }

    public Book(Long id, String bookName, String StringURL, String author, String language, String introduction, String addTime, Integer type, String plane, Integer readProgress, Integer tag, String finish, String timeline) {
        this.id = id;
        this.bookName = bookName;
        this.StringURL = StringURL;
        this.author = author;
        this.language = language;
        this.introduction = introduction;
        this.addTime = addTime;
        this.type = type;
        this.plane = plane;
        this.readProgress = readProgress;
        this.tag = tag;
        this.finish = finish;
        this.timeline = timeline;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getBookName() {
        return bookName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStringURL() {
        return StringURL;
    }

    public void setStringURL(String StringURL) {
        this.StringURL = StringURL;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public Integer getReadProgress() {
        return readProgress;
    }

    public void setReadProgress(Integer readProgress) {
        this.readProgress = readProgress;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

}
