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
        if (flag){
            System.out.println("В строке нет слов");
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
    public String textFromLastLetters(String s){
        StringBuilder ansStr = new StringBuilder("");
        s = s.trim();
        char [] text = s.toCharArray();
        for (int i=0;i < text.length-1;i++)
            if ((text[i+1] == ' ' || text[i+1] == '!' || text[i+1] == '.'
                    || text[i+1] == '?' || text[i+1] == ',' || i == text.length) && Character.isLetter(text[i]))
                ansStr.append(text[i]);
        if (Character.isLetter(text[text.length-1]))
            ansStr.append(text[text.length-1]);
        return ansStr.toString();
    }
    public int countingPunctuationMarks(String str) {
        int count = 0;
        char[] punctuationMarks = {',' , '.' , '!' , '?' , ':' , ';' , '"' , '—' , '(' , ')' , '[' , ']'};
        for (int i = 0;i < punctuationMarks.length;i++){
            int p = 0;
            while (p != -1){
                p = str.indexOf(punctuationMarks[i],p);
                if (p != -1){
                    p++;
                    count++;
                }
            }
        }
        return count;
    }

}
