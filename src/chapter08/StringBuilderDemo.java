package chapter08;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = new String("hi");
    System.out.println(s.hashCode());
    s = s + "!";
    System.out.println(s.hashCode());

    StringBuilder sb = new StringBuilder("hi");
    System.out.println(sb.hashCode());
    sb.append("!");
    System.out.println(sb.hashCode());

    StringBuilder sb1 = new StringBuilder("hello, world");
    sb1.append("!");
    System.out.println("문자열의 길이 : " + sb1.capacity());
    sb1 = sb1.delete(7, 12);
    System.out.println("world 삭제 후 : " + sb1);
    sb1 = sb1.insert(7, "world");
    System.out.println("world를 7번쨰 자리에 추가 후 : " + sb1);
    sb1 = sb1.replace(7, 12, "JAVA");
    System.out.println("world를 JAVA로 변경 후 : " + sb1);



  }
}
