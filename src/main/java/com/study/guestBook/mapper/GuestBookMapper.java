package com.study.guestBook.mapper;

import com.study.guestBook.entity.GuestBookEntity;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface GuestBookMapper {
    // 방명록 등록
    public int registerGuestBook(GuestBookEntity guestBookEntity) throws SQLException;

    // 방명록 조회
    public GuestBookEntity getGuestBook(int id) throws SQLException;

    // 방명록 전체 조회
    public List<GuestBookEntity> getGuestBooks() throws SQLException;

    // 방명록 수정
    public int modifyGuestBook(GuestBookEntity guestBookEntity) throws SQLException;

    // 방명록 삭제
    public int removeGuestBook(int id) throws SQLException;
}
