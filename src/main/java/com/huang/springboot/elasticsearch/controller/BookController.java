package com.huang.springboot.elasticsearch.controller;

import com.huang.springboot.elasticsearch.model.Book;
import com.huang.springboot.elasticsearch.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hsz
 * @date 2019/4/9
 */

@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    @RequestMapping("/save")
    public Book saveBook(@RequestBody Book book) {
        return bookService.save(book);
    }

    @RequestMapping("/findById")
    public Book findById(@RequestParam String id) {
        return bookService.findById(id);
    }
}
