package chapter11;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.empty());

    stack.push("main");
    stack.push("add");
    stack.push("println");

    Iterator<String> iterator = stack.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ",");
    }
    System.out.println();

//    stack.pop();
//    System.out.println(stack);
//
//    stack.pop();
//    System.out.println(stack);
//
//    stack.pop();
//    System.out.println(stack);

//    for (int i = 0; i < stack.size(); i++) {
//      stack.pop();
//      System.out.println(stack);
//    }

    while (!stack.empty()) {
      System.out.println(stack.pop() + "이(가) 종료됐습니다.");
      System.out.println(stack);
    }
    if (stack.empty()) {
      System.out.println("프로그램이 종료되었습니다.");
    }

    stack.add("vector");
    stack.add("list");
    System.out.println(stack);
    System.out.println(stack.peek());
    System.out.println(stack.pop() + "를 삭제했습니다.");
    System.out.println(stack);

  }
}
