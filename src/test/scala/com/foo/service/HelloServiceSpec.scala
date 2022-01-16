package com.foo.service

import org.junit.runner.RunWith
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloServiceSpec extends AnyFlatSpec {

  val service = new HelloService()

  "A HelloService" should "say hello to John" in {
    assert(service.hello("John") === "Hello John!")
  }

  it should "say hello to Sue" in {
    assert(service.hello("Sue") === "Hello Sue!")
  }
}
