package thisisjavaCh15;

import java.util.HashSet;
import java.util.Set;

public class Problem08 {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<Student>();

    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "신용권"));
    set.add(new Student(1, "조민우"));

    System.out.println("저장된 객체 수 : " + set.size());
    for(Student s : set) {
      System.out.println(s.studentNum + " : " + s.name);
    }
  }
}

class Student {
  public int studentNum;
  public String name;

  public Student (int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  @Override
  public int hashCode() {
    return studentNum;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Student student) {
      if (this.hashCode() == student.hashCode()) {
        return true;
      }
    }
    return false;
  }
}
