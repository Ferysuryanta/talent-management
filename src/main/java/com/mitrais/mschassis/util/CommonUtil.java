package com.mitrais.mschassis.util;

import java.util.HashSet;
import java.util.Set;

public class CommonUtil {

  // if new set has all the elements in old set, return the difference set else return null
  public static <T> Set<T> getDifferenceSet(Set<T> newSet,
      Set<T> oldSet) {
    Set<T> intersectSet = new HashSet<>(newSet);
    intersectSet.retainAll(oldSet);
    if (intersectSet.size() == oldSet.size()) {
      Set<T> diffSet = new HashSet<>(
          newSet);
      diffSet.removeAll(oldSet);
      return diffSet;
    } else {
      return null;
    }
  }


}
