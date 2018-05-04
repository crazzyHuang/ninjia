package com.alpha.customer.web;

import com.alpha.customer.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaosheng on 2018/4/3.
 */
@RestController
public class AlphaController {
    @Autowired
    AlphaService alphaService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return alphaService.hiService(name);
    }

    @RequestMapping(value = "/hi2")
    public String hi2(@RequestParam String name){
        return alphaService.hiService2(name);
    }

    @RequestMapping(value = "/logging")
    public String logging(@RequestParam String name) {
        return alphaService.logService(name);
    }

    @RequestMapping("/theNewMethod/{id}")
    public String theNewMethod(@PathVariable String id) {
        //.......
        return alphaService.theNewMethod(id);
    }
}
