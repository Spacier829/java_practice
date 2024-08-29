package day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.realisation();
//        Task2 task2 = new Task2();
//        task2.realisation();
//        Task3 task3 = new Task3();
//        task3.realisation();
    }
}

class Task1 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        String city = "";
        while (!city.equals("STOP")) {
            city = scanner.nextLine();
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }
}

class Task2 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        double dividend = -1;
        double divider = -1;
        while (divider != 0) {
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();
            System.out.println(dividend / divider);
        }
    }
}

class Task3 {
    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        double dividend = -1;
        double divider = -1;
        int counter = 0;
        while (counter < 5) {
            counter++;
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();
            if (divider == 0.0) {
                System.out.println("Infinity");
                continue;
            }

            System.out.println(dividend / divider);
        }
    }
}