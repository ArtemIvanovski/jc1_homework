import Task27.FunctionString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        FunctionString functionString = new FunctionString();
        findHexadecimal(functionString.input());
    }
    private static void findHexadecimal(String s){
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(s);
        System.out.println("Places where hexadecimal numbers are found: ");
        while (matcher.find()){
            System.out.println((matcher.start()+1));
        }
    }
}
