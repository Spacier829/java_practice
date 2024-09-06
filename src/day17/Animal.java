package day17;

public enum Animal {
  DOG("Bobik"),
  CAT("Yea"),
  FROG("QWA");

  private String name;

  Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "кличка - " + name ;
  }
}
