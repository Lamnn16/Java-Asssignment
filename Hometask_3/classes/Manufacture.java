package classes;

public class Manufacture {
    private int year;
    private String make;
    private String place;
    
    public Manufacture(String make, int year, String place) {
        this.make = make;
        this.year = year;
        this.place = place;
    }
    
    public int getYear() {
        return year;
    }
    
    public String getMake() {
        return make;
    }
    
    public String getPlace() {
        return place;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Manufacture [year=" + year + ", make=" + make + ", place=" + place + "]";
    }
}
