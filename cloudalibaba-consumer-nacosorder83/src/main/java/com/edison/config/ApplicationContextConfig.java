package com.edison.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author edison
 * @description
 * @create 2021-02-03 16:17
 **/
@Configuration //用于定义配置类
public class ApplicationContextConfig {
    @Bean //产生一个Bean对象,Spring只会调用一次
    @LoadBalanced //增加客户端负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
