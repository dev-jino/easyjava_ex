package chapter11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"호랑이", "사자", "사슴", "곰"};
    List<String> list = Arrays.asList(animals);
    System.out.println(list);

    list.set(3, "앵무새");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + ", ");
    }
    System.out.println();

//    list.add(0, "바다표범"); // abstractList 라 사용 불가

    for (String ani : list) {
      System.out.print(ani + "= ");
    }
    System.out.println();

//    list.sort(new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        return o1.length() - o2.length();
//      }
//    });
    // 익명 클래스를 람다식으로 교체
    list.sort((s1, s2) -> s1.length() - s2.length());
    list.forEach((s1) -> System.out.print(s1 + "+ "));
    System.out.println(list);

    String[] animalArray = list.toArray(new String[0]);
    System.out.println(Arrays.toString(animalArray));
    Arrays.sort(animalArray);
    System.out.println(Arrays.toString(animalArray));

  }
}
