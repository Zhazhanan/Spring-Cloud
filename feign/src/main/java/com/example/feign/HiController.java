package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WangKun
 * @create 2018-08-30
 * @desc
 **/
@RestController
public class HiController {
    @Autowired
    HiService dao;

    @GetMapping(value = "index")
    public String index(String name) {
        return dao.index(name);
    }
}
