package com.library;


public class BookService {


    private BookRepository bookRepository;


    // Constructor Injection
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

        System.out.println("BookService Constructor Called");

    }


    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

        System.out.println("BookRepository injected using Setter");

    }


    public void addBook() {

        System.out.println("BookService: Adding Book");

        bookRepository.saveBook();

    }

}