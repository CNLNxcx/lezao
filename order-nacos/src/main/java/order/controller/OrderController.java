package order.controller;

import order.service.orderservice;
import order.service.serviceImpl.orderserviceImpl;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    orderservice   service;

    @LoadBalanced
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/add1")
    public int add1(@RequestParam int a, @RequestParam int b){

        return service.add(a,b);
    }


    @GetMapping("/add")
    public String add(){
        System.out.println("下单成功!");
        String msg = restTemplate.getForObject("http://stock-service1/stock/reduct", String.class);
        return "Hello World"+msg;
    }





}
