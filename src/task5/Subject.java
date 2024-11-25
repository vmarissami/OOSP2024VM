package task5;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
