package com.ossebi.Demostration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    
    /**
     * Handles GET requests to the /greet endpoint.
     *
     * @return A greeting message as a String
     */
    @GetMapping("/greet")
    public String hello() {
        return "Hello World";
    }

    /**
     * Handles POST requests to the /greet endpoint.
     *
     * @param name The name to be used in the greeting message.
     * @return A greeting message as a String
     */
    @PostMapping("/greet")
    public String helloPost(@RequestBody String name) {
        return "Hello " + name;
    }
}
