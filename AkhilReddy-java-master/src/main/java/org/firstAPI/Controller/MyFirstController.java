package org.firstAPI.Controller;

import org.firstAPI.Services.MyFirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @Autowired
    MyFirstService myFirstService;

}
