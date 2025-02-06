package com.library.libraryapp.service;

import com.library.libraryapp.db.entity.books.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    private Map<Long, Book> books = new HashMap<Long, Book>();

    @Override
    public Book createBook(Book book) {
        books.put(book.getId(), book);
        return books.get(book.getId());
    }

    @Override
    public Book updateBook(Book book) {
        log.info("Updating book: " + book);
        if(books.containsKey(book.getId())) {
            books.put(book.getId(), book);
        } else {
            throw new RuntimeException("Book not found");
        }
        return books.get(book.getId());
    }

    @Override
    public void deleteBook(Book book) {
        log.info("Deleting book: " + book);
        if(books.containsKey(book.getId())) {
            books.remove(book.getId());
        } else {
            throw new RuntimeException("Book not found");
        }
    }

    @Override
    public List<Book> getAllBooks() {
        log.info("Getting all books");
        return new ArrayList<>(books.values());
    }
}
