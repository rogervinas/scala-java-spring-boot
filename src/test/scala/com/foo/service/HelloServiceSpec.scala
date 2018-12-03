package com.foo.service

import org.scalatest.FlatSpec

class HelloServiceSpec extends FlatSpec {

  val service = new HelloService()

  "A HelloService" should "say hello to John" in {
    assert(service.hello("John") === "Hello John!")
  }

  it should "say hello to Sue" in {
    assert(service.hello("Sue") === "Hello Sue!")
  }
}
