package Task39;

import java.util.Scanner;

public class Input {
    public int input(String str){
        System.out.println(str);
        boolean isCorrectValue = false;
        int value = 0;
        Scanner scanner = new Scanner(System.in);

        while (!isCorrectValue){
            boolean r = scanner.hasNextInt();
            if (r){
                value = scanner.nextInt();
                if(value > 0)
                    isCorrectValue = true;
                else {
                    isCorrectValue = false;
                    System.out.println("Input positive number(>0)");
                }
            }
            scanner.nextLine();
        }
        return value;
    }
}

