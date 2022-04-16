package Task38;

public class Car extends Vehicle{

    private final String model;
    private final String color;

    public Car(String name, String model, String color) {
        super(name);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }
}
