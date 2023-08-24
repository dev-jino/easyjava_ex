package chapter11;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueuDemo1 {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    q.add("바나나");
    q.add("사과");
    q.add("배");

    System.out.println(q.peek());

    while (!q.isEmpty()) {
      System.out.println(q.poll() + "가 삭제되었습니다.");
    }

    System.out.println(q.peek());
    System.out.println(q.poll());

  }
}
