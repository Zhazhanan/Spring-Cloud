package com.example.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author WangKun
 * @create 2018-08-30
 * @desc
 **/
@RestController
public class ConsumerController {
    @Value("${server.lb-client}")
    String serverUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/")
    public String home() {
        return restTemplate.getForEntity(serverUrl, String.class).getBody();
    }

    @GetMapping(value = "/index")
    public String index(String name) {
        return restTemplate.getForEntity(serverUrl + "index?name=" + name, String.class).getBody();
    }
}
