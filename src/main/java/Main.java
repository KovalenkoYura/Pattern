import patterns.decorator.*;

public class Main {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " " + beverage.cost() + "$");
    System.out.println("=======================");
    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Soy(beverage1);
    beverage1 = new Whip(beverage1);

    System.out.println(beverage1.getDescription() + " " + beverage1.cost() + "$");
    System.out.println("=======================");

    Beverage beverage3 = new Espresso();
    beverage3 = new Mocha(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);

    System.out.println(beverage3.getDescription() + " " + beverage3.cost() + "$");

  }
}



