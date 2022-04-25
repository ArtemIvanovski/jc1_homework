package Task47;

import Task46.Input;

public class Console {
    public void showError(){
        System.out.println("Error path. Check path");
    }
    public String showInput(){
        System.out.println("Input path of file: ");
        return new Input().Input();
    }
    public void showText(String text){
        System.out.println(text);
    }
    public void showCountOfMark(String text){
        System.out.println("Count of mark — "+new FunctionOfString().countOfMarks(text));
    }
    public void showCountOfWords(String text){
        System.out.println("Count of words — " + new FunctionOfString().countOfWords(text));
    }
}
