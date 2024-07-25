package Vehicles;

public class Motorcycle implements Vehicle {
    @Override
    public void turnedOn() {
        System.out.println("Ligando a moto...");
    }
    @Override
    public void turnedOff() {
        System.out.println("Desligando a moto...");
    }
    @Override
    public void drive() {
        System.out.println("Pilotando a moto...");
    }
    @Override
    public String getType() {
        return "moto";
    }
}
