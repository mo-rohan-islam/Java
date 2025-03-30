package org.rohan.reactive.controller;

import lombok.RequiredArgsConstructor;
import org.rohan.reactive.dto.User;
import org.rohan.reactive.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Mono<User> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    Flux<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    Mono<ResponseEntity<User>> getUserById(@PathVariable("userId") String id) {
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PutMapping("/{userId}")
    Mono<ResponseEntity<User>> updateUser(@RequestBody User user, @PathVariable("userId") String id) {
        return userService.updateUser(user, id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }

    /**
     * Buggy implementation. Does not differentiate between when document exists vs doesn't.<br>
     * Use {@link UserController#deleteUserV2} instead.
     *
     * @author Rohan Islam
     * @param id the user Id
     * @since 1.0
     * @see UserController#deleteUserV2
     */
    @DeleteMapping("/v1/{userId}")
    Mono<ResponseEntity<Void>> deleteUser(@PathVariable("userId") String id) {
        return userService.deleteUser(id)
                .map(user -> ResponseEntity.noContent().<Void>build())
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/v2/{userId}")
    Mono<ResponseEntity<User>> deleteUserV2(@PathVariable("userId") String id) {
        return userService.deleteUserV2(id)
                .map(user -> ResponseEntity.noContent().<User>build())
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    Flux<User> search(@RequestParam String name) {
        return userService.search(name);
    }
}
