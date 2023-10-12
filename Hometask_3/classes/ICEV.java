package classes;

public class ICEV extends Vehicle {

    final static String VEHICLE_TYPE = "ICEV";
    private int fuelCapacity;
    private int maxDistance;
    Engine engine;
    Manufacture manufacture;

    public ICEV(int fuelCapacity, int maxDistance, String Color, String id, String registerNum,
            int hp, String engineModel, int year, String make, String place) {

        super(VEHICLE_TYPE, Color, id, registerNum);
        this.engine = new CombustionEngine(engineModel, hp);
        this.manufacture = new Manufacture(make, year, place);
        this.maxDistance = maxDistance;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("This is the Internal Combustion Engine Vehicle with Fuel Capacity= " + fuelCapacity + "L" + ", maxDistance="
                + maxDistance + " miles" + ", engine=" + engine + ", manufacture=" + manufacture + ", properties=" + toString());
    }
}
