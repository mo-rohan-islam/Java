package org.rohan.reactive.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.rohan.reactive.dto.User;
import org.rohan.reactive.repository.UserRepository;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Collections;

@RequiredArgsConstructor
@Service
@Slf4j
@Transactional
public class UserService {

    private final ReactiveMongoTemplate reactiveMongoTemplate;
    private final UserRepository userRepository;

    public Mono<User> createUser(User user) {
        return userRepository.save(user);
    }

    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<User> getUserById(String id) {
        return userRepository.findById(id);
    }

    public Mono<User> updateUser(User user, String id) {
        return userRepository.findById(id).flatMap(existingUser -> {
            existingUser.setAge(user.getAge());
            existingUser.setDepartment(user.getDepartment());
            existingUser.setSalary(user.getSalary());
            return userRepository.save(existingUser);
        });
    }

    public Mono<Void> deleteUser(String id) {
        return userRepository.deleteById(id)
                .then();
    }

    public Mono<User> deleteUserV2(String id) {
        return userRepository.findById(id)
                .flatMap(user -> userRepository.delete(user)
                        .then(Mono.just(user)));
    }

    public Flux<User> search(String name) {
        Query query = new Query()
                .with(Sort.by(Collections.singletonList(Sort.Order.asc("age"))));
        query.addCriteria(Criteria
                .where("name")
                .regex(name));

        return reactiveMongoTemplate.find(query, User.class);
    }
}
