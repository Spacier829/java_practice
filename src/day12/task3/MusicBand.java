package day12.task3;

public class MusicBand {
  public int getYear() {
    return year;
  }

  private int year;
  private String name;

  public MusicBand(int year, String name) {
    this.year = year;
    this.name = name;
  }

  @Override
  public String toString() {
    return "MusicBand{" +
           "year=" + year +
           ", name=" + name +
           "}";
  }

}
