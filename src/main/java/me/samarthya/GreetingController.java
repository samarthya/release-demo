/**
 * No License required: You are free to use this code as you wish
 */
package me.samarthya;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * It exposes a simple restcontroller listening on `/` which will allow returning
 * a simple string.
 */
@RestController
public class GreetingController {

    /**
     * GetMethod that responds to the GET '/ 'request
     * @return A constant string "helloSpring!"
     */
    @GetMapping("/")
    public String greeting() {
       return "hello Spring!";
    }
}