package Task43;

public class Main {
    public static void main(String[] args) {
        try {
            new Exception().divide(null,2);
        }catch (NullPointerException e){
            System.out.println("ERROR NullPointerException (null / b)");
            //e.printStackTrace();
        }
    }
}
