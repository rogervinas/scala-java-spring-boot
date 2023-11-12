package com.foo.service

import org.scalatest.flatspec.AnyFlatSpec

class HelloServiceSpec extends AnyFlatSpec {

  val service = new HelloService()

  "A HelloService" should "say hello to John" in {
    assert(service.hello("John") === "Hello John!")
  }

  it should "say hello to Sue" in {
    assert(service.hello("Sue") === "Hello Sue!")
  }
}
