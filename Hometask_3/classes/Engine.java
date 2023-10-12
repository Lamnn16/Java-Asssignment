package classes;

public class Engine {
    private int hP;
    private String model;
    private String type;

    public Engine(String model, String type, int hP) {
        this.model = model;
        this.type = type;
        this.hP = hP;
    }

    public int gethP() {
        return hP;
    }

    public void sethP(int hP) {
        this.hP = hP;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine [hP=" + hP + ", model=" + model + ", type=" + type + "]";
    }

    
}