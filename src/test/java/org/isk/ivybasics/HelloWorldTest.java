package org.isk.ivybasics;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void sayHello() {
    final String hello = new HelloWorld().sayHello("John");
    Assert.assertEquals("Hello John", hello);
  }
}