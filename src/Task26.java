import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        String s = input();
        print(countingPunctuationMarks(s));
    }

    private static void print(int count) {
        System.out.println("В строке "+count+" знаков препинания");
    }

    private static int countingPunctuationMarks(String str) {
        if (str.isBlank()){
            System.out.println("Строка пуста");
            return 0;
        }
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

    private static String input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return scanner.nextLine();
    }

}
