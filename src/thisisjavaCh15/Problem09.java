package thisisjavaCh15;

import java.util.*;

public class Problem09 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null;
    int maxScore = 0;
    int totalScore = 0;

//    for (String key : map.keySet()) {
//      if (map.get(key) > maxScore) {
//        maxScore = map.get(key);
//        name = key;
//      }
//      totalScore += map.get(key);
//    }
//    System.out.printf("name : %s\nmaxScore : %d\ntotalScore : %d\n", name, maxScore, totalScore);

    // 최고 점수
    Collection<Integer> values = map.values();
    maxScore = Collections.max(values);
    System.out.println("최고 점수 : " + maxScore);

    // 점수 합계, 평균
    for (Integer value : values) {
      totalScore += value;
    }
    System.out.println("평균 점수 : " + totalScore / values.size());

    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      if (entry.getValue() == maxScore) {
        name = entry.getKey();
        System.out.println("최고 점수를 받은 아이디 : " + name);
        break;
      }
    }



  }
}
