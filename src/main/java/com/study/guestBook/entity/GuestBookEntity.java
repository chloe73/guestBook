package com.study.guestBook.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestBookEntity {
    public GuestBookEntity() {
        super();
    }

    public GuestBookEntity(int id, String title, String content, String writer, LocalDate register_date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.register_date = register_date;
    }

    private int id;
    private String title;
    private String content;
    private String writer;
    private LocalDate register_date;
}
