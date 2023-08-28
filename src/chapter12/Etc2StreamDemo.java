package chapter12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamDemo {

  public static void main(String[] args) {
    IntStream is1 = IntStream.iterate(1, x -> x + 2);
//    is1.forEach(System.out::println);

    IntStream is2 = new Random().ints(0, 10);
//    is2.forEach(System.out::println);

    Stream<Double> ds = Stream.generate(Math::random);
//    ds.forEach(System.out::println);

    IntStream is3 = IntStream.range(1, 5);
    is3.forEach(System.out::println);

    IntStream is4 = IntStream.rangeClosed(1, 5);
    is4.forEach(System.out::println);

  }
}
