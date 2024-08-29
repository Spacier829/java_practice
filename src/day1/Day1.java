package day1;

public class Day1 {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        task1.realisation();
//        Task2 task2 = new Task2();
//        task2.realisation();
//        Task3 task3 = new Task3();
//        task3.realisation();
//        Task4 task4 = new Task4();
//        task4.realisation();
//        Task5 task5 = new Task5();
//        task5.realisation();
//        Task6 task6 = new Task6();
//        task6.realisation();
    }
}

class Task1 {
    public void realisation() {
        int i = 0;
        while (i < 10) {
            System.out.print("JAVA ");
            i++;
        }
    }
}

class Task2 {
    public void realisation() {
        for (int i = 0; i < 10; i++) {
            System.out.print("JAVA ");
        }
    }
}

class Task3 {
    public void realisation() {
        for (int i = 0; i < 10; i++) {
            System.out.println("JAVA");
        }
    }
}

class Task4 {
    public void realisation() {
        int year = 1980;
        while (year <= 2020) {
            System.out.println(year);
            year += 4;
        }
    }
}

class Task5 {
    public void realisation() {
        for (int year = 1980; year <= 2020; year += 4) {
            System.out.println(year);
        }
    }
}

class Task6 {
    public void realisation() {
        int k = 7;
        for (int i = 1; i < 10 ; ++i) {
            System.out.println(k*i);
        }
    }
}