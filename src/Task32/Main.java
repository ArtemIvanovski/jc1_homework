package Task32;

public class Main {
    public static void main(String[] args) {
        ElectricKettle electricKettle = new ElectricKettle("Redmond","Kettle","transparent",80.50);
        System.out.println(electricKettle.isCondition());
        electricKettle.setCondition(true);
        System.out.println(electricKettle.isCondition());
        electricKettle.makeTea();
        MicroWave microWave = new MicroWave("LG","MicroWave",6.2,423.45);
        microWave.makeFood();
        microWave.setCondition(true);
        microWave.makeFood();
    }
}
class Appliances{
    private String brand;
    private boolean condition = false;

    public Appliances(String brand) {
        this.brand = brand;
    }
    public boolean condition(){
        return condition;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String isCondition() {
        if (condition)
            return " on";
        else
            return " off";
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
class KitchenAppliances extends Appliances{
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String isCondition() {
        return name+super.isCondition();
    }

    public KitchenAppliances(String brand, String name) {
        super(brand);
        this.name = name;
    }
}
class ElectricKettle extends KitchenAppliances{
    private String color;
    private double price;

    public ElectricKettle(String brand, String name, String color, double price) {
        super(brand, name);
        this.color = color;
        this.price = price;
    }

    public void makeTea(){
        if (condition())
            System.out.println("Electric kettle makes tea");
        else
            System.out.println("Turn on electric kettle");
    }
}
class MicroWave extends KitchenAppliances{
    private double weight;
    private double price;

    public MicroWave(String brand, String name, double weight, double price) {
        super(brand, name);
        this.weight = weight;
        this.price = price;
    }
    public void makeFood(){
        if (condition())
            System.out.println("Microwave makes food");
        else
            System.out.println("Turn on microwave");
    }
}
