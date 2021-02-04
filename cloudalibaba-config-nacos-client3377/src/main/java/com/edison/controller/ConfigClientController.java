package com.edison.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author edison
 * @description
 * @create 2021-02-04 8:57
 **/
@RestController
@RefreshScope //⽀持Nacos的动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;//这边可以获取到配置列表菜单配置的信息
    @GetMapping("/config/info")
    public String getConfigInfo(){
        return "配置信息: " + configInfo;
    }
}
