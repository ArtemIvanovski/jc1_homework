package Task46;

import Task27.FunctionString;

import java.util.Scanner;

public class Input {
    public String Input() {
        String str;
        while (true) {
            str = new Scanner(System.in).nextLine();
            if (!new FunctionString().isEmpty(str))
                break;
        }
        return str;
    }
}
