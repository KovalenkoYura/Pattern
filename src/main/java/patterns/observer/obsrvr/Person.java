package patterns.observer.obsrvr;

public class Person implements Observer {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void update() {
    System.out.println("Name is " + this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
