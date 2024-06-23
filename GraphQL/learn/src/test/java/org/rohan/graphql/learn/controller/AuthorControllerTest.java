package org.rohan.graphql.learn.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rohan.graphql.learn.dto.Author;
import org.rohan.graphql.learn.dto.Book;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.graphql.test.tester.HttpGraphQlTester;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthorControllerTest {

    private GraphQlTester graphQlTester;

    @LocalServerPort
    int port;

    @BeforeEach
    void setup() {
        WebTestClient client = WebTestClient
                .bindToServer()
                .baseUrl(String.format("http://localhost:%s/graphql", port))
                .build();

        graphQlTester = HttpGraphQlTester.create(client);
    }

    @Test
    public void authorByLastName_onValidName_getAuthorDetails() {
        this.graphQlTester
                .documentName("authorDetails")
                .variable("lastName", "Rowling")
                .execute()
                .path("authorByLastName")
                .entity(Author.class)
                .satisfies(author -> {
                    Assertions.assertEquals("J. K.", author.getFirstName());
                    Assertions.assertEquals(1, author.getId());
                });
    }

}
