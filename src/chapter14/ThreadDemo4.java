package chapter14;

public class ThreadDemo4 {
  public static void main(String[] args) {
//    Thread thread = new Thread() {
//      @Override
//      public void run() {
//        for (int i = 0; i < 5; i++) {
//          System.out.println("안녕!");
//          try {
//            Thread.sleep(500);
//          } catch (InterruptedException e) {
//
//          }
//        }
//      }
//    };
//    thread.start();

    new Thread() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          System.out.println("안녕!");
          try {
            Thread.sleep(500);
          } catch (InterruptedException e) {

          }
        }
      }
    }.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("main입니다.");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}