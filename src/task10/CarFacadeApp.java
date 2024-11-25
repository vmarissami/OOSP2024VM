package task10;
public class CarFacadeApp {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        carFacade.startCar(22, "Imagine Dragons - Believer");

        System.out.println();

        carFacade.stopCar();
    }
}
