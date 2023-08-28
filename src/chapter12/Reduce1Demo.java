package chapter12;

import java.util.List;
import java.util.Optional;

public class Reduce1Demo {
  public static void main(String[] args) {
    List<Integer> list = List.of(3, 4, 5, 1, 2);
    int i1 = list.stream().reduce((x, y) -> x + y).get();
    int i2 = list.stream().reduce(0, (x, y) -> x + y);

    System.out.println(i1);
    System.out.println(i2);

    int i3 = list.stream().reduce(1, (x, y) -> x * y);

    System.out.println(i3);
  }
}
