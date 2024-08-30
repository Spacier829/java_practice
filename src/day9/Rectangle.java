package day9;

public class Rectangle extends Figure{
  private double height;
  private double weight;

  public Rectangle(String color, double height, double weight) {
    super(color);
    this.height = height;
    this.weight = weight;
  }

  @Override
  public double area() {
    return height*weight;
  }

  @Override
  public double perimeter() {
    return 2*(height+weight);
  }
}
