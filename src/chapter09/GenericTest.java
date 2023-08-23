package chapter09;

import java.util.ArrayList;

public class GenericTest {
  public static void main(String[] args) {
    ArrayList nums = new ArrayList();
    nums.add(10); // Integer 객체로 10이 auto-boxing 됨
    nums.add(3.14); // Double 객체로 3.14가 auto-boxing 됨
    nums.add("30");
    nums.add("hello");

    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) instanceof Integer) {
        System.out.println(((Integer) nums.get(i)) * 2);
      } else if (nums.get(i) instanceof Double) {
        System.out.println(((Double) nums.get(i)) * 2);
      } else if (nums.get(i) instanceof String) {
        System.out.println(Integer.parseInt((String) nums.get(i)));
//        System.out.println("숫자 타입이 아닙니다.");
      }
    }

    System.out.println(((Integer) nums.get(0)) * 2);
  }
}
