package chapter08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main(String[] args) {
    String s= "of the people, by the people, for the people.";
    StringTokenizer st = new StringTokenizer(s);
    System.out.println(st.countTokens());

    StringTokenizer st1 = new StringTokenizer(s, ",");
    System.out.println(st1.countTokens());

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    System.out.println();
    while (st1.hasMoreTokens()) {
      System.out.println(st1.nextToken());
    }

    System.out.println();
    st1 = new StringTokenizer(s, ",");
    while (st1.hasMoreTokens()) {
      System.out.println(st1.nextToken());
    }
  }
}