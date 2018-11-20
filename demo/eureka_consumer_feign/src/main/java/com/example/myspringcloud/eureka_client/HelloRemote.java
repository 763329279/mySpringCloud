package com.example.myspringcloud.eureka_client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qxx on 2018/11/20.
 */
@FeignClient(name= "SPRING-CLOUD-PRODUCER")
public interface HelloRemote {
    @RequestMapping(value = "/hi")
    String hi(@RequestParam(value = "name") String name);
}