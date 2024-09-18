package com.edu.tdm.bean;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWebMVC {

    @GetMapping("/get")
    public String get() {
        return "get()";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "delete()";
    }

    @PostMapping("/post")
    public String post() {
        return "post()";
    }

    @PutMapping("/put")
    public String put() {
        return "put()";
    }

    @PatchMapping("/patch")
    public String patch() {
        return "patch()";
    }

    @RequestMapping("/req")
    public String req() {
        return "req()";
    }
}
/**
 * only can get output n to the web browser with get& req only
 * post,put,patch,delete should test via postman
 */

/**
 * Purpose: This is the controller class responsible for handling incoming HTTP requests. It's marked with @RestController,
 * which combines @Controller and @ResponseBody, making it suitable for RESTful endpoints.

 * Mapping:
 * @RequestMapping("/hello") specifies the base URL for all endpoints in this controller.
 * Individual methods (like get(), post(), delete(), etc.) are mapped to specific HTTP methods (GET, POST, DELETE, etc.) and sub-URLs.
 */