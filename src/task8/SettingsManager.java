package task8;

import java.util.Stack;

public class SettingsManager {
    private Stack<SettingsMemento> history = new Stack<>();

    public void save(Settings settings) {
        history.push(settings.save());
    }

    public void undo(Settings settings) {
        if (!history.isEmpty()) {
            settings.restore(history.pop());
        } else {
            System.out.println("Нет сохраненных настроек для восстановления!");
        }
    }
}
