package patterns.decorator;

public abstract class Beverage {
  String description = "Unknown description";

  public String getDescription() {
    return description;
  }

  public abstract int cost();
}
