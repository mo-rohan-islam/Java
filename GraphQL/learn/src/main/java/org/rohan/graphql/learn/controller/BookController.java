package org.rohan.graphql.learn.controller;

import org.rohan.graphql.learn.dto.Author;
import org.rohan.graphql.learn.dto.Book;
import org.rohan.graphql.learn.service.AuthorService;
import org.rohan.graphql.learn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;

    @QueryMapping
    public Book bookById(@Argument int id) {
        return bookService.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorService.getById(book.getAuthorId());
    }
}