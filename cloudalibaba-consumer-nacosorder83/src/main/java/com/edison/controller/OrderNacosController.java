package com.edison.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author edison
 * @description
 * @create 2021-02-03 16:18
 **/
@RestController
public class OrderNacosController {
    @Resource
    private RestTemplate restTemplate;
    //读取yaml⽂件
    @Value("${service-url.nacos-user-service}")
    private String serverURl;

    /**
     * 实现调用provider接口 http://localhost:8080/payment/nacos/1
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable Long id){
        return
                restTemplate.getForObject(serverURl+"/payment/nacos/"+id,String.class);
    }
}
