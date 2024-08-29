package day7;

public class Day7 {
  public static void main(String[] args) {
//    Task1.main(args);

  }
}

class Task1 {
  public static void main(String[] args) {
    Airplane airplane1 = new Airplane("S7", 1980, 29, 213);
    Airplane airplane2 = new Airplane("Aero", 2563, 22, 956);
    Airplane.compareAirplanes(airplane1,airplane2);
  }
}

class Task2 {
  public static void main(String[] args) {
    Player player1 = new Player();
    System.out.println(player1.getStamina());
    player1.info();
    Player player2 = new Player();
    System.out.println(player2.getStamina());
    player2.info();
    Player player3 = new Player();
    System.out.println(player3.getStamina());
    player3.info();
    Player player4 = new Player();
    System.out.println(player4.getStamina());
    player4.info();
    Player player5 = new Player();
    System.out.println(player5.getStamina());
    player5.info();
    Player player6 = new Player();
    System.out.println(player6.getStamina());
    player6.info();
    Player player7 = new Player();
    System.out.println(player7.getStamina());
    player7.info();
    Player player8 = new Player();
    System.out.println(player8.getStamina());
    player8.info();
    Player player9 = new Player();
    System.out.println(player9.getStamina());
    player9.info();

    while (player1.getStamina() > 0) {
      player1.run();
    }
    System.out.println(player1.getStamina());
    player1.info();

    System.out.println(Player.countPlayers);
  }
}