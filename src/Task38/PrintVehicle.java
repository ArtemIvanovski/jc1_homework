package Task38;

public class PrintVehicle {
    public void PrintVehicle(Garage<?> vehicle){
        System.out.println("В гараже находится "+vehicle.getCountVehicle() + " средства передвижений");
        System.out.println("Name — " + vehicle.getVehicle().getName());
    }
}
