package thisisjavaCh17;

import java.util.Arrays;
import java.util.List;

public class Problem05 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(
        "This is a java book",
        "Lambda Expressions",
        "Java8 supports lambda expressions"
    );
    list.stream()
        .filter(x -> x.toLowerCase().contains("java"))
        .forEach(x -> System.out.println(x));
  }
}
