package classes;

public class HybridV extends Vehicle {
    final static String VEHICLE_TYPE = "HybridV";
    private int batteryCapacity;
    private int fuelCapacity;
    private int maxDistance;
    Engine engine;
    Manufacture manufacture;

    public HybridV(int batteryCapacity, int fuelCapacity, int maxDistance, String Color, String id, String registerNum,
            int hp, String engineModel, int year, String make, String place) {
            
        super(VEHICLE_TYPE, Color, id, registerNum);
        this.engine = new HybridEngine(engineModel, hp);
        this.manufacture = new Manufacture(make, year, place);
        this.batteryCapacity = batteryCapacity;
        this.maxDistance = maxDistance;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("This is the Hybrid Vehicle with Battery Capacity=" + batteryCapacity + "Ah"
                + " Fuel Capacity= " + fuelCapacity + "Ah" + ", maxDistance="
                + maxDistance + " miles" + ", engine=" + engine + ", manufacture=" + manufacture + ", properties=" + toString());
    }
}
