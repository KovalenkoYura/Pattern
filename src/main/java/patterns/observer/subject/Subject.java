package patterns.observer.subject;

import patterns.observer.obsrvr.Observer;

public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
