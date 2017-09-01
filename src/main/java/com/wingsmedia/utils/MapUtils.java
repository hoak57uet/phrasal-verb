package com.wingsmedia.utils;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HoaPham on 7/19/17.
 */

public class MapUtils {
  public static <T, E> List<T> mapList(List<E> from, Class<T> clazz) {
    DozerBeanMapper mapper = new DozerBeanMapper();
    List<T> result = new ArrayList<>();
    for (E e : from) {
      result.add(mapper.map(e, clazz));
    }
    return result;
  }

  public static <T, E> T map(E from, Class<T> clazz) {
    DozerBeanMapper mapper = new DozerBeanMapper();
    return mapper.map(from, clazz);
  }
}
