package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }
    long end = System.nanoTime();
    long arrayList = end - start;
    System.out.println(arrayList);

//    ArrayList는 맨 앞에 넣는 방식은 효율이 떨어짐
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.add(0, i);
    }
    end = System.nanoTime();
    arrayList = end - start;
    System.out.println(arrayList);

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.add(i);
    }
    end = System.nanoTime();
    long LinkedList = end - start;
    System.out.println(LinkedList);

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.add(0, i);
    }
    end = System.nanoTime();
    LinkedList = end - start;
    System.out.println(LinkedList);
  }
}
