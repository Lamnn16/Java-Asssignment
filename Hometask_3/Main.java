import java.util.*;
import classes.BEV;
import classes.HybridV;
import classes.ICEV;
import classes.Vehicle;
 
public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        ICEV icevCar = new ICEV(150, 300, "red", "ABC123", "DA-2020", 100, "BMW-DE-03", 2023, "BMW", "Germany");
        BEV bevCar = new BEV(200, 250, "pink", "ABC123", "DO-2023", 100, "BMW-DE-01", 2023, "TOYOTA", "Japan");
        HybridV hvCar = new HybridV(100, 200, 200, "yellow", "US-2023", "DO-2020", 100, "BMW-DE-06", 2023, "VOL", "USA");
        /* Add more car objects here ... */
        
        vehicles.add(icevCar);
        vehicles.add(bevCar);
        vehicles.add(hvCar);
        
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
        }
    }
}