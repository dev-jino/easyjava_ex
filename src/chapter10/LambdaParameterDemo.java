package chapter10;

public class LambdaParameterDemo {
  public static void main(String[] args) {
    MyFunction f = (a, b) -> a > b ? a : b;
    myMethod(f);
    MyFunction f2 = myFunction2();
    System.out.println(f2.max(10, 20));
  }

  static void myMethod(MyFunction f) {
    System.out.println(f.max(3, 5));
  }

  static MyFunction myFunction2() {
    MyFunction f = (a, b) -> a > b ? a : b;

    return f;
  }
}