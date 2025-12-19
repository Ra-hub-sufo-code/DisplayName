package com.rau.Notification_Service.Config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUCT-SERVICE") //name of which service you want to call
public interface ProductApi {

    @GetMapping("/place")
    public String invokeProductApi();
}
