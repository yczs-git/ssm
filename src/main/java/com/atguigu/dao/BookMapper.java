package com.atguigu.dao;
import com.atguigu.pojo.Book;

import java.util.List;

public interface BookMapper {
    public List<Book> queryBooks();
    public Book queryBookById(Integer id);
    public int updateBook(Book book);
    public int deleteBookById(Integer id);
    public int saveBook(Book book);
}
