package patterns.observer.subject;

import patterns.observer.obsrvr.Observer;
import patterns.observer.obsrvr.Person;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject{
  private List<Observer> observers = new ArrayList<>();
  private List<String> books = new ArrayList<>();

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer p : observers) {
      p.update();
      System.out.println(books);
    }
  }

  public void addBook(String name) {
    books.add(name);
  }

  public void removeBook(String name){
    books.remove(name);
  }
}
