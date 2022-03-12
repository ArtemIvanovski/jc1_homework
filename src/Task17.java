import java.text.DecimalFormat;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println(new DecimalFormat("###,###").format(number));
    }
}
