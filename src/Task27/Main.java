package Task27;

public class Main {
    public static void main(String[] args) {
        FunctionString functionString = new FunctionString();
        String s = functionString.input();
        if (!functionString.isEmpty(s)){
            System.out.println("Количество слов в тексте "+ functionString.countWords(s));
        }
    }
}
