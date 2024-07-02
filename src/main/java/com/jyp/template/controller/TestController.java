//package com.jyp.template.controller;
//
//import com.jyp.template.entity.TbStat;
//import com.jyp.template.repository.TbStatRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/test")
//public class TestController {
//
//    @Autowired
//    private TbStatRepository tbStatRepository;
//
//    @GetMapping("/query")
//    public String hello() {
//        Iterable<TbStat> all = tbStatRepository.findAll();
//        all.forEach(System.out::println);
//        return "Hello, World!";
//    }
//}
