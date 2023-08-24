package chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + "-");
    }
    System.out.println();

    while (iterator.hasNext()) { // iterator는 일회성이다.
      System.out.print(iterator.next() + "+");
    }
    System.out.println();

    iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + "=");
    }
    System.out.println();
  }
}
