package Task38;

import java.util.Scanner;

public class CheckInput {
    public String CheckInput(){
        while (true) {
            String str = new Scanner(System.in).next();
            char[] str1 = str.toCharArray();
            if (str.length() == 0 || str1[0] == ' ') {
                System.out.println("Error ");
                System.out.println("Input again");
            }
            else return str;

        }

    }
}
