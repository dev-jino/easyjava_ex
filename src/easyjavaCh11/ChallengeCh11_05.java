package easyjavaCh11;

import java.util.HashMap;
import java.util.Map;

public class ChallengeCh11_05 {
  public static void main(String[] args) {
    Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
    Map<String, String> hashMap = new HashMap<>(map);

    System.out.println("변경 전 : " + hashMap);

//    hashMap.replaceAll(new BiFunction<String, String, String>() {
//      @Override
//      public String apply(String s, String s2) {
//        return s2.toUpperCase();
//      }
//    });

    hashMap.replaceAll((s1, s2) -> s2.toUpperCase());

    System.out.println("변경 후 : " + hashMap);
  }
}
