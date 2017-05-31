package com.abhiesa.blog.algorithmsj8.fundamentals;

import com.abhiesa.blog.Multiton;
import com.abhiesa.blog.Singleton;

import java.util.List;

/**
 * @author abhiesa
 * @since 29/05/17.
 */

public class BinarySearch<K extends Comparable> extends Singleton {

  private static final Multiton.Creator<BinarySearch> KEY = new Multiton.SuppliedCreator<>(BinarySearch.class, BinarySearch::new);

  private BinarySearch() {

  }

  public static final BinarySearch getInstance() {
    return MULTITON.get(KEY);
  }

  /**
   * Returns the index of the specified key in the specified array.
   *
   * @param a   the array of integers, must be sorted in ascending order
   * @param key the search key
   * @return index of key in array {@code a} if present; {@code -1} otherwise
   */
  public K indexOf(K key, List<K> a) {
    int lo = 0;
    int hi = a.size() - 1;
    while (lo <= hi) {
      // Key is in a[lo..hi] or not present.
      int mid = lo + (hi - lo) / 2;
      if (key.compareTo(a.get(mid)) < 0)
        hi = mid - 1;
      else if (key.compareTo(a.get(mid)) > 0)
        lo = mid + 1;
      else
        return a.get(mid);
    }
    return null;
  }

}
