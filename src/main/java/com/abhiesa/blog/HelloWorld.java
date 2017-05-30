package com.abhiesa.blog;

/**
 * @author Abhishek Pandey
 * @since 31-May-2017
 */
public final class HelloWorld {

  /**
   * @param boolean bigger
   * @return String
   */
  public String getMessage(final boolean bigger) {
    if (bigger) {
      return "Hello Universe!";
    } else {
      return "Hello World!";
    }
  }

}
