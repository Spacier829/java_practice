package day8;

public class Day8 {
  public static void main(String[] args) {
//    long startTime = System.currentTimeMillis();
//    Task1.workString();
//    long endTime = System.currentTimeMillis();
//    long timeElapsed = endTime - startTime;
//    System.out.println(timeElapsed);
//    long startTime1 = System.currentTimeMillis();
//    Task1.workStringBuilder();
//    long endTime1 = System.currentTimeMillis();
//    long timeElapsed1 = endTime1 - startTime1;
//    System.out.println(timeElapsed1);

    Airplane airplane = new Airplane ("S7", 2000, 150, 10000);
    System.out.println(airplane);
  }
}

class Task1 {

  public static void workString() {
    String string = "";
    for (int i = 0; i <= 20000; i++) {
      string += " " + i;
    }
    System.out.println(string);
  }

  public static void workStringBuilder() {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i <= 20000; i++) {
      stringBuilder.append(" " + i);
    }
    System.out.println(stringBuilder.toString());
  }
}
