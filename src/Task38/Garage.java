package Task38;

public class Garage <V extends Vehicle>{

    private static int countVehicle;
    private final V vehicle;

    public int getCountVehicle() {
        return countVehicle;
    }

    public static void setCountVehicle(int countVehicle) {
        Garage.countVehicle = countVehicle;
    }

    public V getVehicle() {
        return vehicle;
    }

    public Garage(V vehicle) {
        countVehicle++;
        this.vehicle = vehicle;
    }

}
