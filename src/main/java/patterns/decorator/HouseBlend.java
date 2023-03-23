package patterns.decorator;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "HouseBlend";
  }

  @Override
  public int cost() {
    return 4;
  }
}
