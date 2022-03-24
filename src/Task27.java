
public class Task27 {
    public static void main(String[] args) {
        String s = Task26.input();
        print(countWords(s));
    }

    private static void print(int count) {
        System.out.println("Количество слов в тексте: " + count);
    }

    private static int countWords(String s) {
        if (s.isBlank()){
            System.out.println("Пустая строка");
            return 0;
        }

        boolean flag = false;
        for (int i=0;i<s.length();i++)
            if ((64 <= s.codePointAt(i) && s.codePointAt(i)<= 90
                    || 97 <= s.codePointAt(i) && s.codePointAt(i)<= 122
                    || 1040 <= s.codePointAt(i) && s.codePointAt(i)<= 1071
                    || 1072 <= s.codePointAt(i) && s.codePointAt(i)<= 1103)){
                flag = true;
                break;
            }
        if (!flag){
            System.out.println("В строке нет букв");
            return 0;
        }
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

}
