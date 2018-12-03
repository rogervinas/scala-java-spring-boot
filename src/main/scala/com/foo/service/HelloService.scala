package com.foo.service

import org.springframework.stereotype.Service

@Service
class HelloService {
  def hello(name: String): String = {
    return "Hello " + name + "!"
  }
}