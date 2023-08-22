package chapter09Problem;

public class chapter09Problem04 {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car.Tire tire = myCar.new Tire();
    Car.Engine engine = new Car.Engine();
  }
}

class Car {
  class Tire {}
  static class Engine {}
}
