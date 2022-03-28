package Task27;

import java.util.Scanner;

public class FunctionString {
    public boolean isEmpty(String s){

        if (s.isBlank()){
           System.out.println("Пустая строка");
           return true;
        }
        boolean flag = true;
        for (int i=0;i<s.length();i++)
            if ((64 <= s.codePointAt(i) && s.codePointAt(i)<= 90
                    || 97 <= s.codePointAt(i) && s.codePointAt(i)<= 122
                    || 1040 <= s.codePointAt(i) && s.codePointAt(i)<= 1071
                    || 1072 <= s.codePointAt(i) && s.codePointAt(i)<= 1103)){
                flag = false;
                break;
            }
        return flag;
    }
    public int countWords(String s){
        s = s.trim();
        char [] text = s.toCharArray();
        int count = 1;
        for (int i = 0; i<text.length; i++){
            if (text[i] == ' '){
                while (text[i] == ' ' && i<text.length) i++;
                count++;

            }
        }
        return count;
    }
    public String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return scanner.nextLine();
    }
}
