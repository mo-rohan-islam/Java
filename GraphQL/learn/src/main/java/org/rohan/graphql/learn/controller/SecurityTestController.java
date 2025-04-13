package org.rohan.graphql.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @apiNote Created to test Spring Security Implementation. DO NOT USE
 *
 * @author Rohan
 */
@RestController
@Deprecated
public class SecurityTestController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome<h1>";
    }

    @GetMapping("/user")
    public String user() {
        return "<h1>Welcome User<h1>";
    }

    @GetMapping("/admin")
    public String admin() {
        return "<h1>Welcome Admin<h1>";
    }
}
