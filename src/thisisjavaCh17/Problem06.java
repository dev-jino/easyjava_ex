package thisisjavaCh17;

import java.util.Arrays;
import java.util.List;

public class Problem06 {
  public static void main(String[] args) {
    List<Member1> list = Arrays.asList(
        new Member1("홍길동", 30),
        new Member1("신용권", 40),
        new Member1("감자바", 26)
    );
    double avg = list.stream()
            .mapToInt(x -> x.getAge())
            .average()
            .getAsDouble();

    System.out.println("평균 나이: " + avg);
  }
}

class Member1 {
  private String name;
  private int age;
  public Member1(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() { return name; }
  public int getAge() { return age; }
}