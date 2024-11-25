package task8;

public class GameSettingsApp {
    public static void main(String[] args) {
        Settings settings = new Settings(50, 70, "Normal");
        SettingsManager manager = new SettingsManager();

        System.out.println("Начальные настройки: " + settings);

        manager.save(settings);

        settings.setVolume(30);
        settings.setBrightness(40);
        settings.setDifficulty("Hard");
        System.out.println("Измененные настройки: " + settings);

        manager.save(settings);

        settings.setVolume(10);
        settings.setBrightness(90);
        settings.setDifficulty("Extreme");
        System.out.println("Сильно измененные настройки: " + settings);

        manager.undo(settings);
        System.out.println("После отмены изменений: " + settings);

        manager.undo(settings);
        System.out.println("Восстановлены начальные настройки: " + settings);
    }
}
