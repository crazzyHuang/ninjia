package com.alpha.customer.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liaosheng on 2018/4/3.
 */
@Service
public class AlphaService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiService2(String name){

        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://SERVICE-HI/hi?name={1}",String.class,name);
        String body = responseEntity.getBody();
        return body;
    }

    public String logService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/root/log?name="+name,String.class);
    }

    public String theNewMethod(String id) {
        //.......
        return restTemplate.getForObject("http://SERVICE-HI/root/theNewMethod/"+id,String.class);
    }
}
