package task5;

import java.util.ArrayList;
import java.util.List;

public class MedicalTest implements Subject {
    private List<Observer> observers; // Список подписчиков
    private String testResult; // Результат анализа

    public MedicalTest() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Пациент подписан на обновления.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Пациент отписан от обновлений.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(testResult);
        }
    }

    public void setTestResult(String result) {
        this.testResult = result;
        notifyObservers();
    }
}
