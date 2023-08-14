package vehicles;

public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String brand, int year, int payloadCapacity) {
        super(brand, year);
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Driving a truck...");
    }
}
