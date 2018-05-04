package com.alpha.provider.demo;

import com.alpha.provider.aspect.RestAspect;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaosheng on 2018/4/4.
 */
@RestController
@RequestMapping("/root")
public class RootController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/log")
    public String logAspect(@RequestParam String name){
        return "hi "+name+",i am from port:" +port;
    }

    @RequestMapping("/theNewMethod/{id}")
    public String theNewMethod(@PathVariable String id) {
        //.......
        return "surprised!! "+ id +" this is new method, my port is " + port;
    }

}
