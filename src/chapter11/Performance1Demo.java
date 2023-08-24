package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Performance1Demo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    // ArrayList 추가
    long start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }
    long end = System.nanoTime();
    long arrayList = end - start;
    System.out.println("ArrayList 추가에 걸린 시간 : " + arrayList);

    // ArrayList 삭제 - 맨 앞에서 삭제
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.remove(0);
    }
    end = System.nanoTime();
    arrayList = end - start;
    System.out.println("ArrayList 맨 앞부터 삭제에 걸린 시간 : " + arrayList);

    // ArrayList 추가
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }

    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.remove(al.size() - 1);
    }
    end = System.nanoTime();
    arrayList = end - start;
    System.out.println("ArrayList 맨 뒤부터 삭제에 걸린 시간 : " + arrayList);

    // LinkedList 추가
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.add(0, i);
    }
    end = System.nanoTime();
    long LinkedList = end - start;
    System.out.println("LinkedList 추가에 걸린 시간 : " + LinkedList);

    // LinkedList 삭제 - 맨 앞에서 삭제
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.removeFirst();
    }
    end = System.nanoTime();
    LinkedList = end - start;
    System.out.println("LinkedList 맨 앞부터 삭제에 걸린 시간 : " + LinkedList);

    // LinkedList 추가
    for (int i = 0; i < 100_000; i++) {
      ll.add(0, i);
    }

    // LinkedList 삭제 - 맨 뒤에서 삭제
    start = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.removeLast();
    }
    end = System.nanoTime();
    LinkedList = end - start;
    System.out.println("LinkedList 맨 뒤부터 삭제에 걸린 시간 : " + LinkedList);
  }
}
