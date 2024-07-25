package strategy.Garages;

import strategy.Vehicles.Motorcycle;

public class MotorcycleGarage extends Garage<Motorcycle> {
    public MotorcycleGarage() {
        super("moto");
    }
    public void storingVehicle(Motorcycle motorcycle) {
        super.storingVehicle(motorcycle);
    }
    public void takingVehicle(Motorcycle motorcycle) {
        super.takingVehicle(motorcycle);
    }
}
