import strategy.Garages.CarGarage;
import strategy.Vehicles.Car;
import strategy.Vehicles.Motorcycle;
import strategy.Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Motorcycle();
        CarGarage garage = new CarGarage();

        System.out.println("-= Testando veículo =-");
        vehicle1.turnedOn();
        vehicle1.drive();
        vehicle1.turnedOff();

        System.out.println("\n-= Testando Colocar veículo na garagem =-");
        garage.storingVehicle((Car) vehicle2);

        System.out.println("\n-= Testando Colocar veículo na garagem ocupada =-");
        garage.storingVehicle((Car) vehicle2);

        System.out.println("\n-= Testando Tirar outro veículo =-");
        garage.takingVehicle((Car) vehicle2);

        System.out.println("\n-= Testando Tirar veículo =-");

        garage.takingVehicle((Car) vehicle1);
        System.out.println("\n-= Testando Tirar veículo da garagem sem veículos =-");

        garage.takingVehicle((Car) vehicle1);

        System.out.println("\n-= tentar colocar outro tipo de veículo na garagem causará uma exception =-");
        garage.storingVehicle((Car) vehicle3);
    }
}