package com.example.elasticsearch.domain;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "book-index3", type = "book3", shards = 1, replicas = 0)


public class Book {
    @Id
    private String id;

    private String title;

    private String author;

    private String price;
}
