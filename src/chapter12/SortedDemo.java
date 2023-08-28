package chapter12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "a2", "d2", "b1", "c2");

    s1.sorted()
        .forEach(Util::print);

    System.out.println();

    s1 = Stream.of("a1", "a2", "d2", "b1", "c2");
    s1.sorted((a1, a2) -> a2.hashCode() - a1.hashCode())
        .forEach(Util::print);

    System.out.println();

    s1 = Stream.of("a1", "a2", "d2", "b1", "c2");
    s1.sorted(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o2.hashCode() - o1.hashCode();
      }
    }).forEach(Util::print);

    System.out.println();

    Nation.nations.stream()
        .sorted(Comparator.comparing(x -> x.getName()))
        .map(x -> x.getName())
        .forEach(x -> Util.printWithParenthesis(x));

    System.out.println();

    Nation.nations.stream()
        .sorted(Comparator.comparing(x -> x.getGdpRank()))
        .map(x -> x.getName())
        .forEach(x -> Util.printWithParenthesis(x));

  }
}
