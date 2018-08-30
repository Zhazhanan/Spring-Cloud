package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangKun
 * @create 2018-08-30
 * @desc
 **/
@RestController
public class IndexController {
    @Value("${ip}")
    private String ip;

    @GetMapping("/from")
    public String from() {
        return this.ip;
    }

}