package chapter12;

import java.util.stream.Stream;

public class Map1Demo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    s1.map(s -> s.toUpperCase())
        .forEach(System.out::println);

    Stream<Integer> i1 = Stream.of(1, 2, 3, 4, 5);
    i1.map(x -> x * 10)
        .forEach(x -> System.out.print(x + " "));
    System.out.println();

    Stream<String> s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))
        .mapToInt(x -> Integer.parseInt(x))
        .mapToObj(i -> "b" + i)
        .forEach(s -> System.out.print(s + " "));
    System.out.println();

    // Stream.of("a1", "a2", "a3"); ==> a1.0 a2.0 a3.0
    Stream<String> s3 = Stream.of("a1", "a2", "a3");
    s3.map(s -> s.substring(1))
        .mapToDouble(s -> Double.parseDouble(s))
        .mapToObj(i -> "a" + i)
        .forEach(s -> System.out.print(s + " "));
    System.out.println();

  }
}
