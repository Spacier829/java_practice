package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day14 {
  public static void main(String[] args) {
    File file = new File("./help/day14help.txt");
//    Task1.printSumDigits(file);
//    List<String> result = Task2.parseFileToStringList();
//    System.out.println(result.toString());
    List<Person> result = Person.parseFileToObject();
    System.out.println(result.toString());
  }
}

class Task1 {

  public static void printSumDigits(File file) {
    int sum = 0;
    int countNumbers = 0;

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
          sum += scanner.nextInt();
          countNumbers++;
        } else {
          scanner.next();
        }

      }
      scanner.close();
      if (countNumbers != 10) {
        throw new MyException();
      }
      System.out.println(sum);
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (MyException e) {
      System.out.println("Некорректный входной файл");
      ;
    }
  }
}

class Task2 {
  public static List<String> parseFileToStringList() {
    File file = new File("./help/day14people.txt");
    List<String> result = new ArrayList<>();
    try (Scanner scanner = new Scanner(file)) {
      String[] man;
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        man = line.split(" ");
        if (Integer.parseInt(man[1]) < 0) {
          throw new MyException();
        }
        result.add(line);
      }
      return result;
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    } catch (MyException e) {
      System.out.println("Некорректный файл");
    }
    return null;
  }
}