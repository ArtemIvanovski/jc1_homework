import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of the first house a:");
        int a = in.nextInt();
        System.out.println("b:");
        int b = in.nextInt();
        System.out.println("Input size of the second house c:");
        int c = in.nextInt();
        System.out.println("d:");
        int d = in.nextInt();
        System.out.println("Input size of country plot e:");
        int e = in.nextInt();
        System.out.println("f:");
        int f = in.nextInt();
        if (a<=e && c<=e && b+d<=f || a<=e && d<=e && b+c<=f || d<=e && b<=e && c+a<=f || d<=e && a<=e && c+b<=f)
            System.out.println("You can put 2 houses on a summer cottage");
        else
            System.out.println("You can not put 2 houses on a summer cottage");
    }
}