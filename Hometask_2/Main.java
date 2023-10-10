import java.io.FileWriter; 
import java.io.IOException; 
import java.io.*; 
import java.util.*; 


public class Main {
    public static void main(String[] args) {
    
        List<Car> cars = new ArrayList<Car>();
        
        cars.add(new Car(1, "Toyota", "Camry", 2018, "Blue", 20000, "ABC123"));  
        cars.add(new Car(2, "Honda", "Civic", 2019, "Red", 22000, "DEF456"));
        cars.add(new Car(3, "Ford", "Focus", 2017, "Silver", 18000, "GHI789"));
        cars.add(new Car(4, "Toyota", "Lexus", 2014, "Black", 24000, "JKL100"));
        cars.add(new Car(5, "Nissan", "Nissan", 2020, "Yellow", 23000, "MNO101"));
        cars.add(new Car(6, "BMW", "Mini", 2021, "Pink", 19000, "XYZ110"));
        // Add more cars here...
        
        List<Car> filteredByBrand = filterCarsByBrand(cars, "Honda");
        saveCarsToFile(filteredByBrand, "HondaCars.txt");

        List<Car> filteredByModelAndAge = filterCarsByModelAndAge(cars, "Camry", 3);
        saveCarsToFile(filteredByModelAndAge, "CamryOver3Years.txt");
        
        List<Car> filterCarsByYearAndPrice = filterCarsByYearAndPrice(cars, 2019, 20000);
        saveCarsToFile(filterCarsByYearAndPrice, "CarsCostFrom20000.txt");
    }

    public static List<Car> filterCarsByBrand(List<Car> cars, String brand) {
        List<Car> filteredByBrand = new ArrayList<Car>();
        for (Car eachCar : cars) {
            if (eachCar.getBrand().equals(brand)) {
                filteredByBrand.add(eachCar);
            }
        }
        return filteredByBrand;
    }

    public static List<Car> filterCarsByModelAndAge(List<Car> cars, String model, int yearsInUse) {
        final int CURRENT_YEAR = 2023;
        List<Car> filterCarsByModelAndAge = new ArrayList<Car>();
        for (Car eachCar : cars) {
            if ((eachCar.getModel().equals(model)) && (CURRENT_YEAR-eachCar.getYear()) > yearsInUse ) {
                filterCarsByModelAndAge.add(eachCar);
            }
        }
        return filterCarsByModelAndAge;
    }

    public static List<Car> filterCarsByYearAndPrice(List<Car> cars, int year, double minPrice) {
        List<Car> filterCarsByYearAndPrice = new ArrayList<Car>();
        for (Car eachCar : cars) {
            if ((eachCar.getYear() == year) && (eachCar.getPrice() > minPrice )) {
                filterCarsByYearAndPrice.add(eachCar);
            }
        }
        return filterCarsByYearAndPrice;
    }

    public static void saveCarsToFile(List<Car> cars, String fileName) { 
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(cars.toString());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            } catch (IOException err) {
            System.out.println("An error occurred.");
            err.printStackTrace();
            }
    }
}