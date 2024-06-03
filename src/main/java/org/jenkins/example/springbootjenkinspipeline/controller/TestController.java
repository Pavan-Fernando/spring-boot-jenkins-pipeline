package org.jenkins.example.springbootjenkinspipeline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        logger.info("test controller received the request!");

        return  new ResponseEntity<>("welcome to example of jenkins with spring boot", HttpStatus.OK);
    }
}
