package strategy.Vehicles;

public class Car implements Vehicle {
    @Override
    public void turnedOn() {
        System.out.println("Ligando o carro...");
    }
    @Override
    public void turnedOff() {
        System.out.println("Desligando o carro...");
    }
    @Override
    public void drive() {
        System.out.println("Dirigindo o carro...");
    }
    @Override
    public String getType() {
        return "carro";
    }
}
