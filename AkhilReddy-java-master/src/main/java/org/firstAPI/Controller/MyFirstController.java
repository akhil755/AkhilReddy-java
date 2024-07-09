package org.firstAPI.Controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @getMapping
    public String myFirstAPI(){
        return "Hello world from Controller";
    }
}
