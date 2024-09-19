package day18;

public class Day18 {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4};
    int sum = recursionSum(numbers, 0);
    System.out.println(count7(717771237));
  }

  private static int recursionSum(int[] array, int index) {
    if (index < 0 || index >= array.length) {
      return 0;
    }
    return array[index] + recursionSum(array, index + 1);
  }

  private static int count7(long number) {
    if (number == 0) {
      return 0;
    }

    long lastDigit = Math.abs(number % 10);
    int count = 0;
    if (lastDigit == 7) {
      count = 1;
    }
    return count + count7(number/10);
  }
}
