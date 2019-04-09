package com.huang.springboot.elasticsearch.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.Date;

/**
 * @author hsz
 */

@Data
@Document(indexName = "lee", type = "book")
public class Book {

    @Id
    private String id;

    private String title;

    private String author;

    private Date publishDate;
}
