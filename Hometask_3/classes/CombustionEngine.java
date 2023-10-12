package classes;

public class CombustionEngine extends Engine {
    final static String ENGINE_TYPE = "Combustion Engine";
    private String model;
    private int hp;
    
    public CombustionEngine(String model, int hp) {
        super(model, ENGINE_TYPE, hp);
        this.model = model;
        this.hp = hp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    public static String getEngineType() {
        return ENGINE_TYPE;
    }
}