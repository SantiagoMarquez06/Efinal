package com.aws.deploy;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/aws/api")
public class AWSControllerTest {

    @GetMapping("/hello")
    public String hello(){

        return "hello AWS - GET!!";
    }

    @PostMapping ("/hello/post")
    public String hellopost(){
        return "hello AWS - Post !!";
    }
}
