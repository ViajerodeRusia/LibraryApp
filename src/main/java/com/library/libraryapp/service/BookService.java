package com.library.libraryapp.service;


import com.library.libraryapp.db.entity.books.Book;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    Book updateBook(Book book);
    void deleteBook(Book book);
    List<Book> getAllBooks();
}
