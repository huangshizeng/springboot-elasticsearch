package com.huang.springboot.elasticsearch.service.impl;

import com.huang.springboot.elasticsearch.model.Book;
import com.huang.springboot.elasticsearch.repository.BookRepository;
import com.huang.springboot.elasticsearch.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author hsz
 */

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        book.setPublishDate(new Date());
        return bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public Book findById(String id) {
        return bookRepository.findById(id).orElseGet(null);
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Page<Book> findByAuthor(String author, int page, int limit) {
        return null;
    }

    @Override
    public Page<Book> findByTitle(String title, int page, int limit) {
        return null;
    }
}
