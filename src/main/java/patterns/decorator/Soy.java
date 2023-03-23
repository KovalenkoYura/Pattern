package patterns.decorator;

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public int cost() {
    return beverage.cost() + 2;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " Soy";
  }
}
