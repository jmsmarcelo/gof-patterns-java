package Garages;

abstract class Garage<T> {
    private T vehicle;
    private final String vehicleType;

    protected Garage(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void storingVehicle(T vehicle) {
        if(this.vehicle == null){
                System.out.printf("Guardando %s na garagem...\n", this.vehicleType);
                this.vehicle = vehicle;
        } else {
            System.out.println("Desculpe, não há vagas");
        }
    }
    public void takingVehicle(T vehicle) {
        if(this.vehicle == null) {
            System.out.printf("Nâo há %s na garagem\n", this.vehicleType);
        } else {
            if(vehicle.equals(this.vehicle)) {
                System.out.printf("Tirando %s da garagem...\n", this.vehicleType);
                this.vehicle = null;
            } else {
                System.out.println("Desculpe, seu veículo não está na garagem");
            }
        }
    }
    public String getVehicleType() {
        return vehicleType;
    }
}
