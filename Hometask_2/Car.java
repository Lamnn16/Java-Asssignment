public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String make, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getBrand() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public String getRegNumber() {
        return this.registrationNumber;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
                + ", price=" + price + ", registrationNumber=" + registrationNumber + "]";
    }
}
