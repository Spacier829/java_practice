package day17;

public enum Season {
  SUMMER(35),
  AUTUMN(10),
  WINTER(-30),
  SPRING(15);

  private final int temperature;

  Season(int temperature) {
    this.temperature = temperature;
  }

  public int getTemperature() {
    return temperature;
  }
}
