package com.abhiesa.blog;

/**
 * @author Abhishek Pandey .
 * @since 31-May-2017
 */
final class HelloWorld {

  /**
   * @param  bigger boolean .
   * @return String
   */
  String getMessage(final boolean bigger) {
    if (bigger) {
      return "Hello Universe!";
    } else {
      return "Hello World!";
    }
  }

}
