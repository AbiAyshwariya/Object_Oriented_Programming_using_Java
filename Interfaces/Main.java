package OOPS.Intefaces;
public class Main {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();

        car.start();
        car.accelerate();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.accelerate();
    }
}