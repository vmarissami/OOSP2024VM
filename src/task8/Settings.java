package task8;

public class Settings {
    private int volume;
    private int brightness;
    private String difficulty;

    public Settings(int volume, int brightness, String difficulty) {
        this.volume = volume;
        this.brightness = brightness;
        this.difficulty = difficulty;
    }

    public SettingsMemento save() {
        return new SettingsMemento(volume, brightness, difficulty);
    }

    public void restore(SettingsMemento memento) {
        this.volume = memento.getVolume();
        this.brightness = memento.getBrightness();
        this.difficulty = memento.getDifficulty();
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "volume=" + volume +
                ", brightness=" + brightness +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
