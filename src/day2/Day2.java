package day2;

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.realisation();
//        Task2 task2 = new Task2();
//        task2.realisation();
//        Task3 task3 = new Task3();
//        task3.realisation();
//        Task4 task4 = new Task4();
//        task4.realisation();
    }
}

class Task1 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        int stages = scanner.nextInt();

        if (1 <= stages && stages <= 4) {
            System.out.println("Мало");
        } else if (5 <= stages && stages <= 8) {
            System.out.println("Средне");
        } else if (9 <= stages) {
            System.out.println("Много");
        } else {
            System.out.println("Error");
        }
    }
}

class Task2 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

class Task3 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a < b) {
            a++;
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}

class Task4 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 420;
        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (-3 < x) {
            y = (x + 3) * (x * x - 2);
        }
        System.out.println(y);
    }
}