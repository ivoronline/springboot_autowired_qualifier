package com.ivoronline.springboot_autowired_qualifier.controllers;

import com.ivoronline.springboot_autowired_qualifier.services.MyServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @Autowired
  @Qualifier("impl1")
  MyServiceInterface myService;

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    String result = myService.sayHello();
    return result;
  }

}
