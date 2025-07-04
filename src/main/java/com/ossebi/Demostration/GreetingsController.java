package com.ossebi.Demostration;

import org.springframework.web.bind.annotation.GetMapping;
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
}
