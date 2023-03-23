
import patterns.observer.obsrvr.Person;
import patterns.observer.subject.Magazine;

public class Main {
  public static void main(String[] args) {
    Person yura = new Person("Yura");
    Person alex = new Person("Alex");

    Magazine magazine = new Magazine();
    magazine.addBook("book1");
    magazine.addBook("book2");
    magazine.addBook("book3");
    magazine.addBook("book4");

    magazine.addObserver(yura);
    magazine.addObserver(alex);

    magazine.notifyObservers();
    magazine.removeBook("book4");
    magazine.notifyObservers();
  }
}



