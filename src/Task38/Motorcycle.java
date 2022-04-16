package Task38;

public class Motorcycle extends Vehicle{

    private final String model;
    private final String color;

    public Motorcycle(String name, String model, String color) {
        super(name);
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
