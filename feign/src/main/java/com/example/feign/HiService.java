package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author WangKun
 * @create 2018-08-30 上午 11:51
 * @desc
 **/
@FeignClient(value = "eureka-client", fallback = HiFallback.class)
public interface HiService {
    @GetMapping("/index")
    String index(@RequestParam("name") String name);
}
