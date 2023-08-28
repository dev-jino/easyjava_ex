package chapter12;

public class Map2Demo {
  public static void main(String[] args) {
    Nation.nations.stream()
        .map(x -> x.getName())
        .limit(4)
        .forEach(x -> Util.printWithParenthesis(x));

    System.out.println();

    Nation.nations.stream()
        .map(x -> x.getGdpRank())
        .forEach(x -> Util.print(x));

    System.out.println();
  }
}
