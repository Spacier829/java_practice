package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Day16 {
  public static void main(String[] args) throws FileNotFoundException {
//    File file = new File("./help/day14help.txt");
//    Task1.printResult(file);
    File file2 = new File("./help/file2.txt");
    Task2.main(args);
    Task2.printResult(file2);
  }
}

class Task1 {
  public static void printResult(File file) {
    int sum = 0;
    int countNum = 0;
    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
          sum += scanner.nextInt();
          countNum++;
        } else {
          scanner.next();
        }
      }
      double mid = (double) sum / countNum;
      System.out.println(mid);
      System.out.printf("%.3f", mid);
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    }
  }
}

class Task2 {
  public static void main(String[] args) throws FileNotFoundException {
    File file1 = new File("./help/file1.txt");
    File file2 = new File("./help/file2.txt");

    PrintWriter pw1 = new PrintWriter(file1);
    int min = 0;
    int max = 100;
    Random random = new Random();
    for (int i = 0; i < 1000; i++) {
      int number = random.nextInt(max - min + 1) + min;
      pw1.println(number);
    }
    pw1.close();
    PrintWriter pw2 = new PrintWriter(file2);
    double sum = 0;
    int counter = 0;
    try (Scanner scanner = new Scanner(file1)) {
      while (scanner.hasNextInt()) {
        sum += scanner.nextInt();
        counter++;
        if (counter == 20) {
          sum = sum / counter;
          pw2.println(sum);
          sum = 0;
          counter = 0;
        }
      }
    }
    pw2.close();
  }

  public static void printResult(File file) throws FileNotFoundException {
    double sum = 0;
    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        sum += Double.parseDouble(scanner.nextLine());
      }
    }
    System.out.println((int) sum);
  }
}