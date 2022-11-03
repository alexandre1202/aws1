package br.com.aab.sbnewrelease.aws1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/aws")
public class EP1Controller {

    private static final Logger LOG = LoggerFactory.getLogger(EP1Controller.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> getDog(@PathVariable String name) {
        LOG.info("GET dog name: {}", name);
        return ResponseEntity.ok("Dog Name: " + name);
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok("Welcome to AWS CDK");
    }
}
