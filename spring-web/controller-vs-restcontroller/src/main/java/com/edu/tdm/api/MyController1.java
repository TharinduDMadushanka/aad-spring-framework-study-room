package com.edu.tdm.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class MyController1 {
    public MyController1() {
        System.out.println("MyController1 Instantiated -constructor()");
    }

    @GetMapping
    public String hello() {
        return "Hello from MyController1";
    }
}

/**
 * @RestController: Returns data directly (e.g., JSON, XML) in the HTTP response body.
 */

/**
 *  @RestController is a combination of @Controller and @ResponseBody.
 *  It indicates that the class will handle HTTP requests and directly return data (not a view).
 *  In this case, it means that the return value of the hello method will be sent as the HTTP response body.
 */
