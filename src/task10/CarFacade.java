package task10;

public class CarFacade {
    private final Engine engine;
    private final ClimateControl climateControl;
    private final AudioSystem audioSystem;

    public CarFacade() {
        this.engine = new Engine();
        this.climateControl = new ClimateControl();
        this.audioSystem = new AudioSystem();
    }

    public void startCar(int temperature, String musicTrack) {
        System.out.println("Подготовка автомобиля...");
        engine.start();
        climateControl.turnOn();
        climateControl.setTemperature(temperature);
        audioSystem.playMusic(musicTrack);
        System.out.println("Автомобиль готов к поездке!");
    }

    public void stopCar() {
        System.out.println("Остановка автомобиля...");
        audioSystem.stopMusic();
        climateControl.turnOff();
        engine.stop();
        System.out.println("Автомобиль остановлен.");
    }
}
