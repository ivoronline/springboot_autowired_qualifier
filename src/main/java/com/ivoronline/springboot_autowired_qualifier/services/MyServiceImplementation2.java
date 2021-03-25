package com.ivoronline.springboot_autowired_qualifier.services;

import org.springframework.stereotype.Service;

@Service("impl2")
public class MyServiceImplementation2 implements MyServiceInterface {

  public String sayHello() {
    return "Hello World";
  }

}
