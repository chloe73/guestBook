package com.study.guestBook.controller;

import com.study.guestBook.entity.GuestBookEntity;
import com.study.guestBook.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/guestBook")
public class GuestBookController {

    @Autowired
    GuestBookService guestBookService;

    // 방명록 등록
    @PostMapping("/register")
    public ResponseEntity<?> registerGuestBook(@RequestBody GuestBookEntity guestBookEntity) throws SQLException {
        int number = guestBookService.registerGuestBook(guestBookEntity);
        return ResponseEntity.ok(number);
    }

    // 방명록 조회
    @GetMapping("")
    public ResponseEntity<?> getGuestBook(@RequestParam int id) throws SQLException {
        return ResponseEntity.ok(guestBookService.getGuestBook(id));
    }

    // 방명록 전체 조회
    @GetMapping("/list")
    public ResponseEntity<?> getGuestBooks() throws SQLException {
        return ResponseEntity.ok(guestBookService.getGuestBooks());
    }

    // 방명록 수정
    @PutMapping("/modify")
    public ResponseEntity<?> modifyGuestBook(@RequestBody GuestBookEntity guestBookEntity) throws  SQLException {
        return ResponseEntity.ok(guestBookService.modifyGuestBook(guestBookEntity));
    }

    // 방명록 삭제
    @DeleteMapping("/remove")
    public ResponseEntity<?> removeGuestBook(@RequestParam int id) throws  SQLException {
        return ResponseEntity.ok(guestBookService.removeGuestBook(id));
    }
}
