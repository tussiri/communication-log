package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@RequestMapping("hello")
public class HelloController {

    // Handles requests at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    //by placing the @RequestMapping("hello") at the top of the class, all of these methods now inherit the structure of that Request. Meaning every request/url mapping will begin with .../hello/.... in this case it would be /hello/goodbye.
    @GetMapping("goodbye")
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // handles requests of the form /hello?name=LaunchCode--in other words, it takes a query parameter, called name with a given value and that value should be used in the response.
// lives at /hello/hello
    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST})
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

//handle requests of the form /hello/LaunchCode-in other words the variable is now part of the path itself.

    @GetMapping("{name}")
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // lives at /hello/form
    @GetMapping("form")

    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method = 'post'>" + //tells the code to submit a request to /hello.
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}