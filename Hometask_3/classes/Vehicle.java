package classes;

public abstract class Vehicle {
    private String type;
    private String color;
    private String id;
    private String registerNum;
    
    public Vehicle(String type, String color, String id, String registerNum) {
        this.type = type;
        this.color = color;
        this.id = id;
        this.registerNum = registerNum;
    }
    
    public abstract void ShowCharacteristics();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }
    
    @Override
    public String toString() {
        return "Vehicle [type=" + type + ", color=" + color + ", id=" + id + ", registerNum=" + registerNum + "]";
    }
}
