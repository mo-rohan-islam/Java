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

import java.util.List;

@Controller
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @Autowired
    BookService bookService;

    @QueryMapping
    public Author authorByLastName(@Argument String lastName) {
        return authorService.getByLastName(lastName);
    }

    @SchemaMapping
    public List<Book> books(Author author) {
        return bookService.getByAuthorId(author.getId());
    }
}
