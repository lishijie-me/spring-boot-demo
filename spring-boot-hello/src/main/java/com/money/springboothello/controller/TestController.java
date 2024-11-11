package com.money.springboothello.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.money.springboothello.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 成行（lishijie-me）
 * @date 2024/11/11 星期一 19:55:28
 * @description TestController
 */
@RestController
public class TestController {
    /**
     * get 请求
     * */
    @GetMapping("/greeting")
    public String getOK(){
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        return "OK";
    }

    /**
     * post请求
     * */
    @PostMapping("/postBook")
    public String postOK(@RequestParam Map<String, Object>  dataMap){
        long startTime = System.currentTimeMillis();
        String bookname = (String) dataMap.get("bookname");
        String author = (String) dataMap.get("author");
        System.out.println(bookname+ author);
        return bookname+ author;
    }

    /**
     * 接收 JSON 参数
     * */
    @PostMapping("/add")
    public String add(@RequestBody Book book) throws JsonProcessingException {
        String bookName = book.getBookName();
        String author = book.getAuthor();
        System.out.println(bookName+ author);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(book);
        System.out.println(jsonString);
        return jsonString;
    }
}
