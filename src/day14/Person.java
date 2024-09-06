package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static List<Person> parseFileToObject(){
    File file = new File("./help/day14people.txt");
    List<Person> result = new ArrayList<>();
    try (Scanner scanner = new Scanner(file)) {
      String[] person;
      while (scanner.hasNextLine()) {
        person = scanner.nextLine().split(" ");
        if (Integer.parseInt(person[1]) < 0) {
          throw new MyException();
        }
        Person man = new Person(person[0], Integer.parseInt(person[1]));
        result.add(man);
      }
      return result;
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (MyException e) {
      System.out.println("Некорректный файл");
    }
    return null;
  }

  @Override
  public String toString() {
    return "{name = " + name +", age = " + age + "}";
  }
}
