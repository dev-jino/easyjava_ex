package chapter08;

import java.util.Date;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[10000];

    System.out.println(System.nanoTime());
    for (int i = 0; i < numbers.length; i++) {
      numbers[i]++;
    }
    System.out.println(System.nanoTime());
    System.out.println(System.currentTimeMillis());
    Date date = new Date(1692751622006L);
    System.out.println(date);
    System.out.println(new Date(System.currentTimeMillis()));
    System.out.println(new Date());
  }
}
