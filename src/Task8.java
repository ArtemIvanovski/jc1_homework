import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers of money:");
        int money = in.nextInt();
        switch (money%10){
            case 1:
                System.out.println(money+" рубль");
                break;
            case 2,3,4:
                System.out.println(money+" рубля");
                break;
            case 5,6,7,8,9,0:
                System.out.println(money+" рублей");
        }

    }
}
