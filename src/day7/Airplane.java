package day7;

public class Airplane {

  private String producer;
  private int year;
  private int length;
  private int weight;
  private int fuel;

  public static void compareAirplanes(Airplane first, Airplane second) {
    if (first.length > second.length) {
      System.out.println("Первый самолет длиннее");
    } else if (first.length < second.length) {
      System.out.println("Второй самолет длиннее");
    } else {
      System.out.println("Длины самолетов равны");
    }
  }

  public Airplane(String producer, int year, int length, int weight) {
    this.producer = producer;
    this.year = year;
    this.length = length;
    this.weight = weight;
    this.fuel = 0;
  }

  public int getFuel() {
    return fuel;
  }

  public void info() {
    System.out.println(
        "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight +
        ", количество топлива в баке: " + fuel);
  }

  public void fillUp(int fuelVolume) {
    this.fuel += fuelVolume;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
