package com.library;

public class BookService {


    private BookRepository bookRepository;


    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }


    public void addBook() {

        System.out.println("Adding book using BookService");

        bookRepository.saveBook();

    }

}