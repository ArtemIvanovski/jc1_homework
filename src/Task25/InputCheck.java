package Task25;

import java.util.Scanner;

public class InputCheck {
    public int inputCheck(){
        Scanner scanner = new Scanner(System.in);
        String productNumberPattern = "[1-5]";
        boolean isCorrectValue = false;
        int value = -1;
        while (!isCorrectValue) {
            boolean r = scanner.hasNextInt();
            if (r) {
                isCorrectValue = true;
                value = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return value;
    }
}
