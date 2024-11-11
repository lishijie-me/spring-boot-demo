package com.money.springboothello.bean;

import java.io.Serializable;

/**
 * @author 成行（lishijie-me）
 * @date 2024/11/11 星期一 22:57:03
 * @description Book
 */
public class Book implements Serializable {
    private long id;
    private String bookName;
    private String author;
    private String publisher;

    public Book() {}

    public Book(long id, String bookName, String author, String publisher) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public long getId() {
        return id;
    }

    public Book setId(long id) {
        this.id = id;
        return this;
    }
}
