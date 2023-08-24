package challengeCh11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChallengeCh11_02 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));

    // Iterator를 이용해 원소 출력
    Iterator<Person> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();

    // 동일한 객체 추가해보기
    // HashSet은 원소의 중복 여부를 hashCode()와 equals() 메서드를 이용해 판단
    System.out.println((new Person("나자바", 35)).hashCode());
    System.out.println((new Person("나자바", 35)).hashCode());

    set.add(new Person("나자바", 35));

    // Iterator를 이용해 원소 출력
    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
    System.out.println();
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
//    return this.name + " : " + this.age;
    return "Person[" + this.name + " : " + this.age + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Person person) {
      if (this.hashCode() == person.hashCode()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return this.name.hashCode() + this.age;
  }
}
