package com.outfitshopping.otw;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DefaultController {

    @RequestMapping(name = "/users", method = RequestMethod.GET)
    public String getUser(){
        return " hello Customer";

    }
}

