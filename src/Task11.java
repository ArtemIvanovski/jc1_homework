import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day of week:");
        int day = in.nextInt();
        switch(day){
            case 1:
                System.out.println("1. Go for a walk");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 2:
                System.out.println("1. Go to cinema");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 3:
                System.out.println("1. Go to shops");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 4:
                System.out.println("1. Go to university");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 5:
                System.out.println("1. Go to park");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 6:
                System.out.println("1. Go to waterpark");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
            case 7:
                System.out.println("1. Go to home");
                System.out.println("2. Analytics");
                System.out.println("3. Learning Java");
                break;
        }
    }

}
