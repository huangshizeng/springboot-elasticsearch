package com.huang.springboot.elasticsearch.repository;

import com.huang.springboot.elasticsearch.model.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author hsz
 */

public interface BookRepository extends ElasticsearchRepository<Book, String> {
}
