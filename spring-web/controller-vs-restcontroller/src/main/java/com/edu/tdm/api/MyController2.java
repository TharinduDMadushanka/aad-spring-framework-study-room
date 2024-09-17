package com.edu.tdm.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/two")
public class MyController2 {
    public MyController2() {
        System.out.println("MyController2 Instantiated -constructor()");
    }

    @GetMapping
    public String hello() {
        return "simple"; // his should be html page name
    }
}
/**
 * @Controller: Returns a view (e.g., a web page).
 */

/**
 * @Controller indicates that this class is a web controller.
 * Unlike @RestController, it expects to return a view (e.g., a JSP, Thymeleaf, or HTML page) that should be rendered on
 * the client side.
 */