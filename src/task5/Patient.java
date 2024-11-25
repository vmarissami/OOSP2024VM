package task5;

public class Patient implements Observer {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    @Override
    public void update(String testResult) {
        System.out.println("Уведомление для " + name + ": Ваш медицинский анализ обновлен. Результат: " + testResult);
    }

    public String getName() {
        return name;
    }
}
