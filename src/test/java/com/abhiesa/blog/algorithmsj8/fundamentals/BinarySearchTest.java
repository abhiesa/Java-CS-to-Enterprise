package com.abhiesa.blog.algorithmsj8.fundamentals;


import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author abhiesa
 * @since 29/05/17.
 */

public class BinarySearchTest {

  @Test
  public void evenTest() {
    final List<Integer> whiteList = IntStream.of(88, 66, 33, 77, 55, 11, 22, 44).sorted().boxed().collect(Collectors
      .toList());
    assertThat(BinarySearch.getInstance().indexOf(11, whiteList)).isEqualTo(11);
    assertThat(BinarySearch.getInstance().indexOf(22, whiteList)).isEqualTo(22);
    assertThat(BinarySearch.getInstance().indexOf(33, whiteList)).isEqualTo(33);
    assertThat(BinarySearch.getInstance().indexOf(44, whiteList)).isEqualTo(44);
    assertThat(BinarySearch.getInstance().indexOf(55, whiteList)).isEqualTo(55);
    assertThat(BinarySearch.getInstance().indexOf(66, whiteList)).isEqualTo(66);
    assertThat(BinarySearch.getInstance().indexOf(77, whiteList)).isEqualTo(77);
    assertThat(BinarySearch.getInstance().indexOf(88, whiteList)).isEqualTo(88);
    assertThat(BinarySearch.getInstance().indexOf(99, whiteList)).isEqualTo(null);
  }

  @Test
  public void oddTest() {
    final List<Integer> whitelist = IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8).boxed().collect(Collectors.toList());
    assertThat(BinarySearch.getInstance().indexOf(0, whitelist)).isEqualTo(0);
    assertThat(BinarySearch.getInstance().indexOf(1, whitelist)).isEqualTo(1);
    assertThat(BinarySearch.getInstance().indexOf(2, whitelist)).isEqualTo(2);
    assertThat(BinarySearch.getInstance().indexOf(3, whitelist)).isEqualTo(3);
    assertThat(BinarySearch.getInstance().indexOf(4, whitelist)).isEqualTo(4);
    assertThat(BinarySearch.getInstance().indexOf(5, whitelist)).isEqualTo(5);
    assertThat(BinarySearch.getInstance().indexOf(6, whitelist)).isEqualTo(6);
    assertThat(BinarySearch.getInstance().indexOf(7, whitelist)).isEqualTo(7);
    assertThat(BinarySearch.getInstance().indexOf(8, whitelist)).isEqualTo(8);
    assertThat(BinarySearch.getInstance().indexOf(9, whitelist)).isEqualTo(null);
  }

}
