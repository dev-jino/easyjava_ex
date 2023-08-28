package chapter12;

import java.util.Optional;
import java.util.OptionalInt;

public class Optional2Demo {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = null;

    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);
    

    Util.print(Optional.ofNullable(o1));
    System.out.println();
    Util.print(Optional.ofNullable(o2));
    System.out.println();

    if (o2.isPresent()) {
      Util.print(o2.get());
    } else {
      System.out.println("데이터가 없습니다.");
    }

    String s = o2.orElse("데이터가 없음");
    System.out.println("s = " + s);
  }
}
