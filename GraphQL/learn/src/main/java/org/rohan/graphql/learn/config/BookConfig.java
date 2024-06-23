package org.rohan.graphql.learn.config;

import org.rohan.graphql.learn.dto.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    public List<Book> bookInit() {
        return Arrays.asList(
                new Book(1, "Harry Potter - The Philosopher's Stone", 1000, 1),
                new Book(2, "The Chronicles of Narnia", 2500, 2),
                new Book(3, "Harry Potter - The Goblet of Fire", 2000, 1)
        );
    }
}
