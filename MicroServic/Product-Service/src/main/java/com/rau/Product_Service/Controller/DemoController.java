package com.rau.Product_Service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/product")
public class DemoController {

    @Autowired
    private Environment env;

    @GetMapping("/place")
    public String placeOrder(){
        String port=env.getProperty("server.port");
        return "running on port "+port+" Hello your order : Iphone is placed";
    }

    @GetMapping("/order/{name}")
    public String orderWithName(@PathVariable String name){
        return "Hello "+name+" Your oder is placed";
    }
}
