package day9;

public class Task1 {
  public static void main(String[] args) {
    Student student = new Student("Bob", "ABS");
    Teacher teacher = new Teacher("Tom", "Math");

    student.printInfo();
    teacher.printInfo();
  }
}
