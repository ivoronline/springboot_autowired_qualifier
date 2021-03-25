package com.ivoronline.springboot_autowired_qualifier.services;

import org.springframework.stereotype.Service;

@Service("impl1")
public class MyServiceImplementation1 implements MyServiceInterface {

  public String sayHello() {
    return "Hello";
  }

}


