import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = in.nextInt();
        System.out.println("Input number b: ");
        int b = in.nextInt();
        System.out.println("a + b + a * b = "+ sum(a,b));
    }
    static int sum(int a, int b){
        int sum;
        sum = a+b+a*b;
        return sum;
    }
}
