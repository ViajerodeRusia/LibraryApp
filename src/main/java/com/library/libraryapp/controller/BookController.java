package com.library.libraryapp.controller;

import com.library.libraryapp.db.entity.books.Book;
import com.library.libraryapp.service.BookService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@Tag(name = "Book Controller", description = "APIs for managing books in the library")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Operation(summary = "Create a new book", description = "Creates a new book entry in the library system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Book successfully created"),
        @ApiResponse(responseCode = "400", description = "Invalid book data provided")
    })
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @Operation(summary = "Update an existing book", description = "Updates the details of an existing book in the library system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Book successfully updated"),
        @ApiResponse(responseCode = "404", description = "Book not found"),
        @ApiResponse(responseCode = "400", description = "Invalid book data provided")
    })
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @Operation(summary = "Delete a book", description = "Removes a book from the library system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Book successfully deleted"),
        @ApiResponse(responseCode = "404", description = "Book not found")
    })
    @DeleteMapping
    public void deleteBook(@RequestBody Book book) {
        bookService.deleteBook(book);
    }

    @Operation(summary = "Get all books", description = "Retrieves a list of all books in the library system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved list of books"),
        @ApiResponse(responseCode = "204", description = "No books found")
    })
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}
