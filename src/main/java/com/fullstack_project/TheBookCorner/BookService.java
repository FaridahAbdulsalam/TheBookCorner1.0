package com.fullstack_project.TheBookCorner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    //CREATE

    public void addBook(Book book){

    }

    //READ
    //UPDATE
    //DELETE
}
