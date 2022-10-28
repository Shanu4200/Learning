package com.api.book.bootrestbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestbook.entities.book;
import com.api.book.bootrestbook.services.BookService;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<book> getBooks(){
        return this.bookService.getAllBooks();
    }
    
    @GetMapping("/books/{id}")
    public book getBook(@PathVariable("id") int id){

        return bookService.getBookbyId(id);

    }
    
}
