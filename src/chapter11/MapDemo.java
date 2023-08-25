package chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "딸기", 10, "배", 1);
    System.out.println(fruits);
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");

//    fruits.put("키위", 100); // immutable(불변) 객체이므로 수정, 추가, 삭제 불가 (Map.of로 생성해서)
    System.out.println("사과는 " + fruits.get("사과") + "개 있습니다.");

    Set<String> keys = fruits.keySet();
    System.out.println(keys);

    for (String key : keys) {
      System.out.print(key + " ");
    }
    System.out.println();

    Collection<Integer> values = fruits.values();
    System.out.println(values);


  }
}
