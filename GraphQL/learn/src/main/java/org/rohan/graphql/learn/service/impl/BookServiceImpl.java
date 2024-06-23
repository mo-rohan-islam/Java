package org.rohan.graphql.learn.service.impl;

import org.rohan.graphql.learn.dto.Book;
import org.rohan.graphql.learn.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    List<Book> bookList;

    @Autowired
    BookServiceImpl(List<Book> bookInit) {
        this.bookList = bookInit;
    }

    @Override
    public Book getById(int id) {
        return bookList.stream()
                .filter(book -> book.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public List<Book> getByAuthorId(int authorId) {
        return bookList.stream()
                .filter(book -> book.getAuthorId() == authorId)
                .toList();
    }
}
