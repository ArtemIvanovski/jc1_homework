package Task38;

public class Main {
    public static void main(String[] args) {
        Garage<Car> car = new Garage<>(new Input().car());
        new PrintVehicle().PrintVehicle(car);
        Garage<Motorcycle> motorcycle = new Garage<>(new Input().motorcycle());
        new PrintVehicle().PrintVehicle(motorcycle);
    }
}
