package com.example.demo.controller;

import com.example.demo.service.CalculateService;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author didi
 * @Date 2021/2/23
 */
@RestController
public class TestController {
    @Autowired
    private CalculateService calculateService;
    @Autowired
    private TestService testService;
    @RequestMapping("/test")
    public String getHello() {
        String testList = testService.getList("code123","name456");
        String calculateResult = calculateService.getResult("测试");
        return (testList + "," +calculateResult);
    }
}
    