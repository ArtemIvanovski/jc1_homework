package Task25;

import java.util.Scanner;

public class InputCheck {
    public int inputCheck(String productNumberPattern){
        Scanner scanner = new Scanner(System.in);
        if  (productNumberPattern == ""){
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
        boolean isCorrectValue = false;
        int value = -1;
        while (!isCorrectValue) {
            boolean r = scanner.hasNext(productNumberPattern);
            if (r) {
                isCorrectValue = true;
                value = scanner.nextInt();
            }
            scanner.nextLine();
        }
        return value;
    }
}
