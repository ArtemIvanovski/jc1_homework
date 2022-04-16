package Task38;

public class Input {
    private String name;
    private String model;
    private String color;

    public Car car(){
        System.out.println("Input name of car");
        name = new CheckInput().CheckInput();
        System.out.println("Input model of car");
        model = new CheckInput().CheckInput();
        System.out.println("Input color of car");
        color = new CheckInput().CheckInput();
        return new Car(name,model,color);
    }

    public Motorcycle motorcycle(){
        System.out.println("Input name of motorcycle");
        name = new CheckInput().CheckInput();
        System.out.println("Input model of motorcycle");
        name = new CheckInput().CheckInput();
        System.out.println("Input color of motorcycle");
        name = new CheckInput().CheckInput();
        return new Motorcycle(name,model,color);
    }
}
