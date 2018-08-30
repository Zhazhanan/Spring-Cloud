package com.example.feign;

import org.springframework.stereotype.Service;

/**
 * @author WangKun
 * @create 2018-08-30
 * @desc
 **/
@Service
public class HiFallback implements HiService {
    @Override
    public String index(String name) {
        return "index error";
    }
}
