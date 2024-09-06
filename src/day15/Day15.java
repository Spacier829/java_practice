package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Day15 {
  public static void main(String[] args) throws FileNotFoundException {
    File outFile = new File("./help/day15missing_shoes.txt");
    PrintWriter pw = new PrintWriter(outFile);
    try (Scanner scanner = new Scanner(new File("./help/shoes.csv"))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] lineParts = line.split(";");
        if (lineParts[2].equals("0")) {
          pw.println(line);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    }
    pw.close();
  }
}
