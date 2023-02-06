package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {


    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(@RequestParam String name, @RequestParam String language) {
        if(name == null){
            name = "World";
        }
        return createMessage(name, language);

    }

    public static String createMessage(String name, String language) {
        String greeting = "";
        if (language.equals("english")) {
            greeting = "Hello";
        } else if (language.equals("french")) {
            greeting = "Bonjour";
        } else if (language.equals("spanish")) {
            greeting = "Hola";
        } else if (language.equals("germain")) {
            greeting = "Hallo";
        } else if (language.equals("russian")) {
            greeting = "Zdravstvuyte";
        }
        return greeting + " " + name;

    }


}