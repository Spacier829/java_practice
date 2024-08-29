package day7;

import java.util.Random;

public class Player {
  private static final int MAX_STAMINA = 100;
  private static final int MIN_STAMINA = 0;
  private static final int MAX_PLAYERS = 6;
  public static int countPlayers = 0;

  public Player() {
    Random randomStamina = new Random();
    this.stamina = randomStamina.nextInt(MAX_STAMINA - 90 + 1) + 90;

    if (countPlayers < MAX_PLAYERS) {
      countPlayers++;
    }
  }

  private int stamina;

  public int getStamina() {
    return stamina;
  }

  public void run() {
    if (stamina > 0) {
      stamina--;
    }
    checkStamina();
  }

  private void checkStamina() {
    if (stamina == 0) {
      countPlayers--;
    }
  }

  public void info() {
    if (countPlayers < MAX_PLAYERS) {
      System.out.println("Команды неполные. На поле еще есть свободных мест: " + (MAX_PLAYERS - countPlayers));
    } else {
      System.out.println("На поле нет свободных мест.");
    }
  }
}
