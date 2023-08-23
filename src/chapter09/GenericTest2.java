package chapter09;

import java.util.ArrayList;

public class GenericTest2 {
  public static void main(String[] args) {
    int num = 30;
    ArrayList<Integer> nums = new ArrayList<>();
    nums.add(10); // Integer 객체로 10이 auto-boxing 됨
    nums.add(num);
// Generics 을 사용하면 컴파일 시에 타입을 체크하기 때문에 Integer가 아닌 원소는 추가할 수 없음
//    nums.add(3.14); // Double 객체로 3.14가 auto-boxing 됨
//    nums.add("30");
//    nums.add("hello");

    for (int i = 0; i < nums.size(); i++) {
      System.out.println(nums.get(i) * 2);
    }

    String s = "world";
    ArrayList<String> strs = new ArrayList<>();
    strs.add("hello");
    strs.add(s);
    strs.add("");
    strs.add(null);

    for (int i = 0; i < strs.size(); i++) {
      String getStr = strs.get(i);
      if (getStr != null) {
        System.out.println(strs.get(i).length());
      } else {
        System.out.println("아무것도 없습니다.");
      }
    }
  }
}
