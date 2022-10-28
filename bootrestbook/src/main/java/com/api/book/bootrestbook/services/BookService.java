package com.api.book.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;

import com.api.book.bootrestbook.entities.book;

@ComponentScan
public class BookService {

    private static List<book> list=new ArrayList<>();

    static{
        list.add(new book(2,"The Subtle Art of Springboot","Shanu"));
        list.add(new book(3,"The Subtle Art of Java","Vijay"));
        list.add(new book(4,"The Subtle Art of React","Janu"));
    }

    //Get All Books
    public List<book> getAllBooks(){
        return list;
    }

    //Get a Single Book by ID
    public book getBookbyId(int id){

       book book=null;
       book = list.stream().filter(e->e.getId()==id).findFirst().get();
       return book;
    }
    
    
}
