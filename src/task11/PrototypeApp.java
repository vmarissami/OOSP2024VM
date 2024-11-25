package task11;

public class PrototypeApp {
    public static void main(String[] args) {
        AppSettings defaultSettings = new AppSettings("Light", 14, true);

        AppSettings user1Settings = defaultSettings.clone();
        user1Settings.setTheme("Dark");
        user1Settings.setFontSize(16);

        AppSettings user2Settings = defaultSettings.clone();
        user2Settings.setNotifications(false);

        System.out.println("Настройки по умолчанию: " + defaultSettings);
        System.out.println("Настройки пользователя 1: " + user1Settings);
        System.out.println("Настройки пользователя 2: " + user2Settings);
    }
}
