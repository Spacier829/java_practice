package day5;

public class Day5 {
    public static void main(String[] args) {
        Task1.main(args);
        Task2.main(args);
    }
}

class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2024);
        car.setColor("Nardo Grey");
        car.setModel("RS6");
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2024, "Blue", "R1");
        System.out.println(bike.getModel());
        System.out.println(bike.getColor());
        System.out.println(bike.getYear());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
