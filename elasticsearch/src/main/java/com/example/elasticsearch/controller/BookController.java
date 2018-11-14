package com.example.elasticsearch.controller;

import com.example.elasticsearch.dao.BookDao;
import com.example.elasticsearch.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BookController {
    @Autowired
    BookDao bookDao;


    @PostMapping("/book")
    public String insertBook(@RequestBody Book book) throws Exception {
        log.info("Inserted Book Object");
        return bookDao.insertBook(book);
    }

   @GetMapping("/book")
    public List<Book> gellListOfBook(){

        return bookDao.getAllBook();
   }

   @DeleteMapping("/book/{id}")
    public void deleteById(@PathVariable String id){
       log.info("Delete Specific book Object");
        bookDao.deleteCurrentRow(id);

   }
   @GetMapping("/book/name/{author}")
    public Book getByName(@PathVariable String author){
        return bookDao.getByAuthor(author);
   }

   @DeleteMapping("/book/deleteAll")
    public void deleteAll(){
        bookDao.deleteAllValue();

   }



}
