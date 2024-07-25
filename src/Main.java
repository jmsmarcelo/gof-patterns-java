import Garages.CarGarage;
import Vehicles.Car;
import Vehicles.Motorcycle;
import Vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car vehicle1 = new Car();
        Car vehicle2 = new Car();
        Vehicle vehicle3 = new Motorcycle();
        CarGarage garage = new CarGarage();

        System.out.println("-= Testando veículo =-");
        vehicle1.turnedOn();
        vehicle1.drive();
        vehicle1.turnedOff();

        System.out.println("\n-= Testando Colocar veículo na garagem =-");
        garage.storingVehicle(vehicle2);

        System.out.println("\n-= Testando Colocar veículo na garagem ocupada =-");
        garage.storingVehicle(vehicle2);

        System.out.println("\n-= Testando Tirar outro veículo =-");
        garage.takingVehicle(vehicle2);

        System.out.println("\n-= Testando Tirar veículo =-");

        garage.takingVehicle(vehicle1);
        System.out.println("\n-= Testando Tirar veículo da garagem sem veículos =-");

        garage.takingVehicle(vehicle1);

        System.out.println("\n-= tentar colocar outro tipo de veículo na garagem causará uma exception =-");
        garage.storingVehicle((Car) vehicle3);
    }
}