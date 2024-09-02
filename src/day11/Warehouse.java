package day11;

public class Warehouse {
  private int countOrders;
  private double balance;

  public int getCountOrder() {
    return countOrders;
  }

  public void setCountOrder(int countOrders) {
    this.countOrders = countOrders;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Warehouse{" +
           "balance=" + balance +
           ", countOrders=" + countOrders +
           '}';
  }
}
