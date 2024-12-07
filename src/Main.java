import Products.Packaging;
import Products.Storage;
import Transportation.TransportMethod;
import Transportation.Vehicle;

public class Main {
    public static void main(String[] args) {
        /*
        Vehicle truck = new Vehicle("Truck", TransportMethod.ROAD, 10.0, 80.0);
        Vehicle airplane = new Vehicle("Airplane", TransportMethod.AIR, 20.0, 600.0);
        Vehicle ship = new Vehicle("Ship", TransportMethod.SEA, 50.0, 50.0);

        System.out.println(truck.getVehicleType() + " Speed: " + truck.calculateSpeed() + " km/h");
        System.out.println(truck.getVehicleType() + " Cost Per Km: " + truck.calculateCostPerKm() + " TL/km");

        System.out.println(airplane.getVehicleType() + " Speed: " + airplane.calculateSpeed() + " km/h");
        System.out.println(airplane.getVehicleType() + " Cost Per Km: " + airplane.calculateCostPerKm() + " TL/km");

        System.out.println(ship.getVehicleType() + " Speed: " + ship.calculateSpeed() + " km/h");
        System.out.println(ship.getVehicleType() + " Cost Per Km: " + ship.calculateCostPerKm() + " TL/km");

         */

        Storage storage = new Storage("electronics",112);
        storage.printInfo();
        Packaging p1 = new Packaging(111,5,"Non-Sensitive");
        p1.printInfo();
    }
}
