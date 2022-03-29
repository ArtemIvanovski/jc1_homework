import Task27.FunctionString;

public class Task30 {

    public static void main(String[] args) {
        FunctionString functionString = new FunctionString();
        String s = functionString.input();
        System.out.println(s.replaceAll("<p id=p1>", "<p>"));
    }
}
