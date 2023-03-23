package patterns.decorator;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public int cost() {
    return beverage.cost() + 1;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " Whip";
  }
}
