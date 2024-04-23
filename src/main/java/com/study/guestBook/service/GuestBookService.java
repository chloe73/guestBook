package com.study.guestBook.service;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.study.guestBook.entity.GuestBookEntity;
import com.study.guestBook.mapper.GuestBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class GuestBookService {

    @Autowired
    private GuestBookMapper guestBookMapper;

    // 방명록 등록
    public int registerGuestBook(GuestBookEntity guestBookEntity) throws SQLException {
        guestBookEntity.setRegister_date(LocalDateTime.now());
        return guestBookMapper.registerGuestBook(guestBookEntity);
    }

    // 방명록 조회
    public GuestBookEntity getGuestBook(int id) throws SQLException {
        return guestBookMapper.getGuestBook(id);
    }

    // 방명록 전체 조회
    public List<GuestBookEntity> getGuestBooks() throws SQLException {
       return guestBookMapper.getGuestBooks();
    }

    // 방명록 수정
    public int modifyGuestBook(GuestBookEntity guestBookEntity) throws SQLException {
        return guestBookMapper.modifyGuestBook(guestBookEntity);
    }

    // 방명록 삭제
    public int removeGuestBook(int id) throws SQLException {
        return guestBookMapper.removeGuestBook(id);
    }
}
