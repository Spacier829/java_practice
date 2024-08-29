package day6;

import javax.xml.transform.Source;
import java.util.Random;

public class Teacher {
  private String name;
  private String subject;

  public Teacher(String name, String subject) {
    this.name = name;
    this.subject = subject;
  }

  public String getName() {
    return name;
  }

  public String getSubject() {
    return subject;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void evaluate(Student student) {
    Random random = new Random();
    int min = 2;
    int max = 5;
    int grade = random.nextInt(max - min + 1) + min;
    System.out.println(
        "Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject
        + " на" + " оценку " + getTextGrade(grade));
  }

  private String getTextGrade(int grade) {
    return switch (grade) {
      case (2) -> "Неудовлетворительно";
      case (3) -> "Удовлетворительно";
      case (4) -> "Хорошо";
      case (5) -> "Отлично";
      default -> null;
    };
  }
}
