package com.rau.Notification_Service.Controller;

import com.rau.Notification_Service.Config.AppConfig;
import com.rau.Notification_Service.Config.ProductApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/notification")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String notification(){
        return "Welcome to Notification API";
    }

    @Autowired
    private ProductApi productApi;

    @GetMapping("/product")
    public String getProduct(){
        String s1="Hello from notification API";
        //String s2=restTemplate.getForObject("http://localhost:9091/product/place",String.class);
        String s2=productApi.invokeProductApi();
        return s1+" Product API "+s2;
    }
}
