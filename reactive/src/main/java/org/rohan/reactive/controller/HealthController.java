package org.rohan.reactive.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Slf4j
public class HealthController {

    @GetMapping
    ResponseEntity<Health> healthCheck() {
        Health health = Health.up().build();
        log.info("Health is up!");
        return ResponseEntity.ok(health);
    }
}
