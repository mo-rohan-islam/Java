package org.rohan.graphql.learn.service.impl;

import org.rohan.graphql.learn.dto.Author;
import org.rohan.graphql.learn.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    List<Author> authorList;

    @Autowired
    AuthorServiceImpl(List<Author> authorInit) {
        this.authorList = authorInit;
    }

    @Override
    public Author getById(int id) {
        return authorList.stream()
                .filter(author -> author.getId() == id)
                .findAny().orElse(null);
    }

    @Override
    public Author getByLastName(String lastName) {
        return authorList.stream()
                .filter(author -> author.getLastName().equals(lastName))
                .findAny().orElse(null);
    }
}
