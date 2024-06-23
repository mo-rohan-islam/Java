package org.rohan.graphql.learn.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rohan.graphql.learn.dto.Book;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.graphql.test.tester.HttpGraphQlTester;
import org.springframework.test.web.reactive.server.WebTestClient;

//@GraphQlTest(BookController.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerTest {

//    @Autowired
//    private GraphQlTester graphQlTester;
    private HttpGraphQlTester graphQlTester;

    @LocalServerPort
    private int port;

    @BeforeEach
    void setup() {
        WebTestClient client = WebTestClient
                .bindToServer()
                .baseUrl(String.format("http://localhost:%s/graphql", port))
                .build();

        graphQlTester = HttpGraphQlTester.create(client);
    }

//    @Test
//    void contextLoads() {
//        Assertions.assertNotNull(graphQlTester);
//    }

    @Test
    public void bookDetails_onValidBookId_returnsBookData() {
        this.graphQlTester
                .documentName("bookDetails")
                .variable("id", 1)
                .execute()
                .path("bookById")
                .entity(Book.class)
                .satisfies(book -> {
                    Assertions.assertEquals("Harry Potter - The Philosopher's Stone", book.getName());
                    Assertions.assertEquals(1000, book.getPages());
                });
    }
}
