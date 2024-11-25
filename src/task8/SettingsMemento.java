package task8;

public class SettingsMemento {
    private final int volume;
    private final int brightness;
    private final String difficulty;

    public SettingsMemento(int volume, int brightness, String difficulty) {
        this.volume = volume;
        this.brightness = brightness;
        this.difficulty = difficulty;
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
