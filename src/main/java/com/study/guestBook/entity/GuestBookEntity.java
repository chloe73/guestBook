package com.study.guestBook.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GuestBookEntity {
    public GuestBookEntity() {
        super();
    }

    public GuestBookEntity(int id, String title, String content, String writer, LocalDateTime register_date) {
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
    private LocalDateTime register_date;
}
