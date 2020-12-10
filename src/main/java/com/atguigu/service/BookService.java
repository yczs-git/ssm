package com.atguigu.service;
import com.atguigu.pojo.Book;
import com.atguigu.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;


    public List<Book> queryBooks(){
        return bookMapper.queryBooks();
    }

    public Book queryBookById(Integer id){
        return bookMapper.queryBookById(id);

    }

    public int updateBook(Book book){
        return bookMapper.updateBook(book);
    }

    public int saveBook(Book book){
        return bookMapper.saveBook(book);
    }

    public int deleteBookById(Integer id){
        return bookMapper.deleteBookById(id);
    }
}
