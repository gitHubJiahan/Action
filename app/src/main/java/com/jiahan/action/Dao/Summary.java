package com.jiahan.action.Dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "SUMMARY".
 */
public class Summary {

    private Long id;
    private java.util.Date time;
    private String words;
    private Long book_id;

    public Summary() {
    }

    public Summary(Long id) {
        this.id = id;
    }

    public Summary(Long id, java.util.Date time, String words, Long book_id) {
        this.id = id;
        this.time = time;
        this.words = words;
        this.book_id = book_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getTime() {
        return time;
    }

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

}
