package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.realisation();
//        Task2 task2 = new Task2();
//        task2.realisation();
//        Task3 task3 = new Task3();
//        task3.realisation();
        Task4 task4 = new Task4();
        task4.realisation();
    }
}

class Task1 {
    int[] arr;
    int biggerCounter = 0;
    int equalCounter = 0;
    int evenCounter = 0;
    int oddCounter = 0;
    int sum = 0;

    public void realisation() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        this.arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int elem : arr) {
            if (elem > 8) {
                biggerCounter++;
            }
            if (elem == 1) {
                equalCounter++;
            }
            if (elem % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            sum += elem;
        }
        print_info();
    }

    public void print_info() {
        System.out.print("Arr: ");
        System.out.println(Arrays.toString(arr));

        System.out.print("Len: ");
        System.out.println(arr.length);

        System.out.print("Bigger 8: ");
        System.out.println(biggerCounter);

        System.out.print("Equal 1: ");
        System.out.println(equalCounter);

        System.out.print("Even: ");
        System.out.println(evenCounter);

        System.out.print("Odd: ");
        System.out.println(oddCounter);

        System.out.print("Sum: ");
        System.out.println(sum);
    }
}

class Task2 {
    int[] arr = new int[100];
    int max = 0;
    int min = 10000;
    int countZeroEnd = 0;
    int sumZeroEnd = 0;

    public void realisation() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        for (int elem : arr) {
            if (elem > max) {
                max = elem;
            }
            if (elem < min) {
                min = elem;
            }
            if (elem % 10 == 0) {
                countZeroEnd++;
                sumZeroEnd += elem;
            }
        }
        print_info();
    }

    public void print_info() {
        System.out.println(max);
        Arrays.sort(arr);
        System.out.println();
        System.out.println(min);
        System.out.println(countZeroEnd);
        System.out.println(sumZeroEnd);
    }
}

class Task3 {
    int[][] matrix = new int[12][8];
    int indexMax = -1;
    int maxSum = 0;

    public void realisation() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                indexMax = i;
            }
        }
        System.out.println(indexMax);
    }
}

class Task4 {
    public void realisation() {
        int[] arr = new int[100];
        int sum = 0;
        int index = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        for (int i = 1; i < arr.length - 2; i++) {
            int tempSum = arr[i - 1] + arr[i] + arr[i + 1];
            if (sum <= tempSum) {
                sum = tempSum;
                index = i - 1;
            }
        }
        System.out.println(sum);
        System.out.println(index);
    }
}