package org.minolles.pocs.reactivedemo.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {
    @GetMapping("/sample")
    public Mono<String> helloWorld(){
        return Mono.just("Hello world");
    }

    @GetMapping("/multiple")
    public Flux<Integer> multiple(){
        return Flux.just(1,2,3,4,5);
    }

    @GetMapping("/withDelay")
    public Flux<Integer> withDelay(){
        return Flux.just(1,2,3,4,5,6,7,8,9).delayElements(Duration.ofSeconds(1L)).log();
    }
}
