package com.foo.controller;

import com.foo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Autowired
  HelloService service;

  @GetMapping("/hello")
  String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    return service.hello(name);
  }
}
