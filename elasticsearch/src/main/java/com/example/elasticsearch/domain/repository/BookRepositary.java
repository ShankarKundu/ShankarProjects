package com.example.elasticsearch.domain.repository;
import com.example.elasticsearch.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BookRepositary extends ElasticsearchRepository<Book,String> {
    Book findByAuthor(String author);
}
