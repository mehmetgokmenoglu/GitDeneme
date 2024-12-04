import Model.TransportMethod;
import Model.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Vehicle("Truck", TransportMethod.ROAD, 10.0, 80.0);
        Vehicle airplane = new Vehicle("Airplane", TransportMethod.AIR, 20.0, 600.0);
        Vehicle ship = new Vehicle("Ship", TransportMethod.SEA, 58.0, 40.0);

        System.out.println(truck.getName() + " Speed: " + truck.calculateSpeed() + " km/h");
        System.out.println(truck.getName() + " Cost Per Km: " + truck.calculateCostPerKm() + " TL/km");

        System.out.println(airplane.getName() + " Speed: " + airplane.calculateSpeed() + " km/h");
        System.out.println(airplane.getName() + " Cost Per Km: " + airplane.calculateCostPerKm() + " TL/km");

        System.out.println(ship.getName() + " Speed: " + ship.calculateSpeed() + " km/h");
        System.out.println(ship.getName() + " Cost Per Km: " + ship.calculateCostPerKm() + " TL/km");
    }
}
