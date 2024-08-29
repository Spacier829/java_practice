package day6;

public class Day6 {
  public static void main(String[] args) {
//    Task2.main(args);
    Task3.main(args);
  }
}

class Task2 {
  public static void main(String[] args) {
    Airplane airplane = new Airplane("S7", 2021, 213, 50000);
    airplane.info();
    airplane.setYear(2014);
    airplane.setLength(230);
    airplane.fillUp(6500);
    airplane.fillUp(1200);
    airplane.info();
  }
}

class Task3 {
  public static void main(String[] args) {
    Teacher teacher =  new Teacher("Bob", "Math");
    Student student = new Student("Tom");
    teacher.evaluate(student);
  }
}
