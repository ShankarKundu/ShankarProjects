package com.example.elasticsearch.dao;

import com.example.elasticsearch.domain.Book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.elasticsearch.domain.repository.*;

import java.util.*;

@Repository
@Slf4j
public class BookDao {


    @Autowired
    private BookRepositary bookRepositary;



    //Insert

    public String insertBook(Book book){
        bookRepositary.save(book);
        return "successfully insert";
    }

    //getting

    public List<Book> getAllBook(){

        Iterable<Book> itr=bookRepositary.findAll();
        List<Book> lsBook=new ArrayList<>();
        itr.forEach(lsBook::add);
        if(lsBook.size()==0){
            log.info("Sorry boss value is empty");
        }
        log.info("Getting Book object"+lsBook);
        return lsBook;
    }


    public void deleteCurrentRow(String id) {
        bookRepositary.deleteById(id);
    }

    public Book getByAuthor(String author) {
        return bookRepositary.findByAuthor(author);
    }

    public void deleteAllValue() {
        bookRepositary.deleteAll();
    }
}
