package com.rau.Product_API.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/place")
    public String orderPlace(){
        return "Your order : Iphone is Done";
    }
}
