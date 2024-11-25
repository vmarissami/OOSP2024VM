package task11;

public class AppSettings {
    private String theme;
    private int fontSize;
    private boolean notifications;

    public AppSettings(String theme, int fontSize, boolean notifications) {
        this.theme = theme;
        this.fontSize = fontSize;
        this.notifications = notifications;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public AppSettings clone() {
        return new AppSettings(this.theme, this.fontSize, this.notifications);
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "theme='" + theme + '\'' +
                ", fontSize=" + fontSize +
                ", notifications=" + notifications +
                '}';
    }
}
