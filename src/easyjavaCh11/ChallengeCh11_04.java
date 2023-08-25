package easyjavaCh11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeCh11_04 {
  public static List<Integer> scoresArray = new ArrayList<>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("점수를 입력하세요 : ");
      int score = sc.nextInt();
      if (score < 0) {
        // 학생의 정보 출력 & 최고 점수 구하기
        int maxScore = printScore();
        // 성적 처리
        printGrade(maxScore);
        break;
      } else {
        scoresArray.add(score);
      }
    }
  }

  static int printScore() {
    System.out.println("전체 학생은 "+ scoresArray.size() +"명이다.");
    int highScore = 0;

    System.out.print("학생들의 성적 : ");
    for (int score : scoresArray) {
      if (score > highScore) {
        highScore = score;
      }
      System.out.print(score + " ");
    }
    System.out.println();
    return highScore;
  }

  static void printGrade(int highScore) {
    for (int i = 0; i < scoresArray.size(); i++) {
      int score = scoresArray.get(i);
      if (score >= highScore - 10) {
        System.out.printf("%d번 학생의 성적은 %d점이며 등급은 A이다.\n", i, score);
      } else if (score >= highScore - 20 && score < highScore - 10) {
        System.out.printf("%d번 학생의 성적은 %d점이며 등급은 B이다.\n", i, score);
      } else {
        System.out.printf("%d번 학생의 성적은 %d점이며 등급은 C이다.\n", i, score);
      }
    }
  }

}
