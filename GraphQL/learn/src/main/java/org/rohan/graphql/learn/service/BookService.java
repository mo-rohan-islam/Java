package org.rohan.graphql.learn.service;

import org.rohan.graphql.learn.dto.Book;

import java.util.List;

public interface BookService {

    Book getById(int id);
    List<Book> getByAuthorId(int authorId);
}
