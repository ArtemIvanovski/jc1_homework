
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
//        if (s.matches("[a-zA-Zа-яА-Я]+")){                //TODO: create method on the presence of at least one letter
//            System.out.println("В строке нету букв");
//            return 0;
//        }
        int count = 1;
        s = s.trim();
        char [] text = s.toCharArray();
        for (int i = 0; i<text.length; i++){
            if (text[i] == ' '){
                while (text[i] == ' ' && i<text.length) i++;
                count++;

            }
        }
        return count;
    }

}
