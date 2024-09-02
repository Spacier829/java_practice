package day12;

//import day12.task3.MusicBand;

import day12.task5.MusicBand;
import day12.task5.MusicArtist;

import java.util.*;

public class Day12 {
  public static void main(String[] args) {
//    Task1.main(args);
//    Task2.main(args);
//    Task3.main(args);
    Task4.main(args);
  }
}

class Task1 {
  public static void main(String[] args) {
    List<String> cars = new ArrayList<>();
    cars.add("Audi");
    cars.add("Toyota");
    cars.add("BMW");
    cars.add("Porsche");
    cars.add("KIA");

    for (String car : cars) {
      System.out.println(car);
    }

    cars.add(2, "Subaru");
    cars.removeFirst();

    for (String car : cars) {
      System.out.println(car);
    }
  }
}

class Task2 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    for (int i = 0; i <= 30; i++) {
      if (i % 2 == 0) {
        numbers.add(i);
      }
    }

    for (int i = 300; i <= 500; i++) {
      if (i % 2 == 0) {
        numbers.add(i);
      }
    }

    for (int number : numbers) {
      System.out.println(number);
    }
  }
}

class Task3 {
  public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
    List<MusicBand> result = new ArrayList<>();
    for (MusicBand band : bands) {
      if (band.getYear() >= 2000) {
        result.add(band);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    MusicBand musicBand1 = new MusicBand(1999, "1");
    MusicBand musicBand2 = new MusicBand(2000, "2");
    MusicBand musicBand3 = new MusicBand(1980, "3");
    MusicBand musicBand4 = new MusicBand(1996, "4");
    MusicBand musicBand5 = new MusicBand(2001, "5");
    MusicBand musicBand6 = new MusicBand(2005, "6");
    MusicBand musicBand7 = new MusicBand(2025, "7");
    MusicBand musicBand8 = new MusicBand(2002, "8");
    MusicBand musicBand9 = new MusicBand(1987, "9");
    MusicBand musicBand10 = new MusicBand(1750, "10");

    List<MusicBand> bands = new ArrayList<>();
    bands.add(musicBand1);
    bands.add(musicBand2);
    bands.add(musicBand3);
    bands.add(musicBand4);
    bands.add(musicBand5);
    bands.add(musicBand6);
    bands.add(musicBand7);
    bands.add(musicBand8);
    bands.add(musicBand9);
    bands.add(musicBand10);
    Collections.shuffle(bands);
    System.out.println(bands.toString());
    System.out.println(groupsAfter2000(bands).toString());

  }
}

class Task4 {
  public static void main(String[] args) {
    MusicBand musicBand1 = new MusicBand(1999, "1");
    MusicBand musicBand2 = new MusicBand(2222, "2");

    musicBand1.addMember(new MusicArtist("A B", 12));
    musicBand1.addMember(new MusicArtist("C D", 23));
    musicBand1.addMember(new MusicArtist("E F", 145));

    musicBand2.addMember(new MusicArtist("X I", 54));
    musicBand2.addMember(new MusicArtist("Z P", 782));
    musicBand2.addMember(new MusicArtist("Y U", 97));


    MusicBand.transferMembers(musicBand1, musicBand2);

    int a = 123;

  }
}