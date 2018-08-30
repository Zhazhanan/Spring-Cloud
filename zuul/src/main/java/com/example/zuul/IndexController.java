package com.example.zuul;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangKun
 * @create 2018-08-30
 * @desc
 **/
//@RestController("/api")
public class IndexController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
