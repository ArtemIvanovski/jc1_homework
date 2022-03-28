import Task27.FunctionString;

import java.util.Arrays;

public class Task28 {
    public static void main(String[] args) {
        FunctionString functionString = new FunctionString();
        String s = functionString.input();
        if (!functionString.isEmpty(s)){
            System.out.println(functionString.textFromLastLetters(s));
        }
    }

}
