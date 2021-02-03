package com.edison.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author edison
 * @description
 * @create 2021-02-03 15:51
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/payment/nacos/{id}")
    public String getPayment( @PathVariable Integer id){
        return "nacos 注册中⼼，服务端⼝:"+serverPort +"\t id"+id;
    }
}
