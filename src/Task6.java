import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = in.nextInt();
        System.out.println("Last number 7 in "+number+"?");
        System.out.println(check(number));

    }
    static boolean check(int a){
        return (a%10==7);
    }
}
