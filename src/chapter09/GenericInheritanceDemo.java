package chapter09;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beer> a1 = new ArrayList<>();
    ArrayList<Boricha> a2 = new ArrayList<>();
    ArrayList<Beverage> a3 = new ArrayList<>();
    
    a3.add(new Beverage());
    a3.add(new Beer());
    a3.add(new Boricha());
    Beer beer = (Beer) a3.get(1);

    System.out.println(beverageTest(a3));
//    System.out.println(beverageTest(a2)); // a2와 a3는 상속 관계가 아님
    
  }

  static boolean beverageTest(ArrayList<Beverage> array) {
    return true;
  }
}
