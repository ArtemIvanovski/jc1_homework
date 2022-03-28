import Task27.FunctionString;

public class Task26 {
    public static void main(String[] args) {
        FunctionString functionString = new FunctionString();
        String s = functionString.input();
        if (!functionString.isEmpty(s)){
            System.out.println("В строке "+functionString.countingPunctuationMarks(s)+" знаков препинания");
        }
    }
}
