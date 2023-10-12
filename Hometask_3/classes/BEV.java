package classes;

public class BEV extends Vehicle {
    final static String VEHICLE_TYPE = "BEV";
    private int batteryCapacity;
    private int maxDistance;
    private Engine engine;
    private Manufacture manufacture;

    public BEV(int batteryCapacity, int maxDistance, String Color, String id, String registerNum,
            int hp, String engineModel, int year, String make, String place) {
        super(VEHICLE_TYPE, Color, id, registerNum);
        this.engine = new ElectricEngine(engineModel, hp);
        this.manufacture = new Manufacture(make, year, place);
        this.batteryCapacity = batteryCapacity;
        this.maxDistance = maxDistance;
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("This is the Battery Electric Vehicle with Battery Capacity=" + batteryCapacity + "kW" + ", maxDistance="
                + maxDistance + " miles" + ", engine=" + engine + ", manufacture=" + manufacture + ", properties=" + toString());
    }
}
