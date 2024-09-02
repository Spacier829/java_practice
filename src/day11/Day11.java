package day11;

public class Day11 {
  public static void main(String[] args) {
    Warehouse warehouse = new Warehouse();
    Courier courier = new Courier(warehouse);
    Picker picker = new Picker(warehouse);

    for (int i = 0; i < 1500; i++) {
      picker.doWork();
      picker.bonus();
    }
    for (int i = 0; i < 1000; i++){
      courier.doWork();
      courier.bonus();
    }

    System.out.println(warehouse.toString());

    Warehouse warehouse1 = new Warehouse();
    Courier courier1 = new Courier(warehouse1);
    Picker picker1 = new Picker(warehouse1);

    courier1.doWork();
    picker1.doWork();
    System.out.println(warehouse1.toString());
  }
}
