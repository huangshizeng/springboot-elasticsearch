package com.huang.springboot.elasticsearch.service;

import com.huang.springboot.elasticsearch.model.Book;
import org.springframework.data.domain.Page;

/**
 * @author hsz
 */

public interface BookService {

    Book save(Book book);

    void delete(Book book);

    Book findById(String id);

    Iterable<Book> findAll();

    Page<Book> findByAuthor(String author, int page, int limit);

    Page<Book> findByTitle(String title, int page, int limit);
}
