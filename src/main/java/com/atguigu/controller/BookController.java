package com.atguigu.controller;


import com.atguigu.dao.BookMapper;
import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/book")
@Controller
public class BookController {

    @Autowired
    BookService bookService;



    @RequestMapping("/list")
    @ResponseBody
    public List<Book> queryBooks(){
        return bookService.queryBooks();
    }


}
