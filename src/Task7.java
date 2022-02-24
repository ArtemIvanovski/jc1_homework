import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size rectangle a:");
        int a = in.nextInt();
        System.out.println("b:");
        int b = in.nextInt();
        System.out.println("Input radius circle:");
        int r = in.nextInt();
        if (r >= 0.5*Math.sqrt(Math.pow(a,2)+Math.pow(b,2)))
            System.out.println("The circle will cover the rectangle");
        else
            System.out.println("The circle won't cover the rectangle");

    }
}
