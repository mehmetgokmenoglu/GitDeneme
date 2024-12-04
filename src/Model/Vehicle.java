package Model;

public class Vehicle implements Transportable {

    private String name;
    private TransportMethod transportMethod;
    private double capacity;
    private double baseSpeed;

    public Vehicle(String name, TransportMethod transportMethod, double capacity, double baseSpeed) {
        this.name = name;
        this.transportMethod = transportMethod;
        this.capacity = capacity;
        this.baseSpeed = baseSpeed;
    }

    @Override
    public double calculateSpeed() {
        switch (transportMethod) {
            case ROAD: return baseSpeed; // Kara için hız
            case AIR: return baseSpeed * 2.0;  // Hava için hız
            case SEA: return baseSpeed * 0.5;  // Deniz için hız
            default: throw new IllegalArgumentException("Bilinmeyen taşıma yöntemi!");
        }
    }

    @Override
    public double calculateCostPerKm() {
        switch (transportMethod) {
            case ROAD: return 1.0;
            case AIR: return 5.0;
            case SEA: return 2.0;
            default: throw new IllegalArgumentException("Bilinmeyen taşıma yöntemi!");
        }
    }

    // Getter-Setter ve diğer metotlar

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransportMethod getTransportMethod() {
        return transportMethod;
    }

    public void setTransportMethod(TransportMethod transportMethod) {
        this.transportMethod = transportMethod;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getBaseSpeed() {
        return baseSpeed;
    }

    public void setBaseSpeed(double baseSpeed) {
        this.baseSpeed = baseSpeed;
    }

}
