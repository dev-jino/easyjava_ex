package chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

    System.out.println("정렬 전 : " + list);

    Collections.sort(list, new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s1.compareTo(s2);
      }
    });
    System.out.println("오름차순 정렬 후 : " + list);

    Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
    System.out.println("내림차순 정렬 후 : " + list);
  }
}