package chapter09;

import java.io.BufferedInputStream;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    int i = 3;
    String s = "";

    try {
      s.length();
      int res = 10 / i;
    } catch (ArithmeticException e) {
//      throw new RuntimeException(e);
      System.out.println("0으로 나눌 수 없습니다.");
    } catch (NullPointerException e) {
      System.out.println("문자열의 내용이 없습니다.");
    } catch (Exception e) { // 범위가 더 넓은 것을 뒤에 써야함
      System.out.println("예외가 발생했습니다.");
    } finally {
      System.out.println("프로그램을 종료합니다.");
    }
  }
}
