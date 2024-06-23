package org.rohan.graphql.learn.service;

import org.rohan.graphql.learn.dto.Author;
import org.springframework.stereotype.Service;

public interface AuthorService {

    Author getById(int id);
    Author getByLastName(String lastName);

}
