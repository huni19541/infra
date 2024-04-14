package com.example.gateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Mono;

@Controller
@Slf4j
public class FallbackController {

    @GetMapping("/fallback")
    @ResponseBody
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }
}
