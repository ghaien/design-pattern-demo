package com.ghaien.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
public class DesignPatternDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public Mono<String> hello() throws InterruptedException {
        Thread.sleep(5000);
        return Mono.just("hello webflux");
    }

}
