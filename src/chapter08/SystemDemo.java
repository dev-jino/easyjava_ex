package chapter08;

public class SystemDemo {
  public static void main(String[] args) {
    int[] numbers = new int[10000];

    System.out.println(System.nanoTime());
    for (int i = 0; i < numbers.length; i++) {
      numbers[i]++;
    }
    System.out.println(System.nanoTime());
  }
}
