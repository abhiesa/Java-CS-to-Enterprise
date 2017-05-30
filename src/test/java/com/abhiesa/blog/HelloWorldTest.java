package com.abhiesa.blog;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

  private HelloWorld subject;

  @Before
  public void setup() {
    subject = new HelloWorld();
  }

  @Test
  public void testGetMessage() {

    assertThat(subject.getMessage(false)).isEqualTo("Hello World!");
    assertThat(subject.getMessage(true)).isEqualTo("Hello Universe!");

  }

}
