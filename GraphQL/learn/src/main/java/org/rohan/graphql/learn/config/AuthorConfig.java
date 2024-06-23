package org.rohan.graphql.learn.config;

import org.rohan.graphql.learn.dto.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AuthorConfig {

    @Bean
    public List<Author> authorInit() {
        return Arrays.asList(
                new Author(1, "J. K.", "Rowling"),
                new Author(2, "C. S.", "Lewis"),
                new Author(3, "Al", "Ilaha")
        );
    }
}
