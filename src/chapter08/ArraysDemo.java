package chapter08;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'J', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);

    System.out.println(a1);
    System.out.println(a2);

    String[] s1 = {"A", "B", "C", "D"};
    int d = Arrays.binarySearch(s1, "D");
    System.out.println(d);

    for (String s : s1) {
      if (s.equalsIgnoreCase("d")) {
        System.out.println("찾았습니다.");
      }
    }
    
    String[] sa = {"케이크", "애플", "도넛", "바나나"};
    print(sa);

    Arrays.sort(sa);
    print(sa);

    System.out.println(Arrays.binarySearch(sa, "애플"));
  }

  static void print(Object[] oa) {
    for (Object o : oa) {
      System.out.print(o + " ");
    }
    System.out.println();
  }
}
