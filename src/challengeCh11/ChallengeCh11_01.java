package challengeCh11;

import java.util.ArrayList;
import java.util.List;

public class ChallengeCh11_01 {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("갈매기");
    arrayList.add("나비");
    arrayList.add("다람쥐");
    arrayList.add("라마");

    for (String name : arrayList) {
      if (name.length() == 2) {
        System.out.println(name);
      }
    }
  }
}
