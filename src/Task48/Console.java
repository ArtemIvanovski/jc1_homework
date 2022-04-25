package Task48;

import java.util.ArrayList;

public class Console extends Task47.Console {
    public void showSum(ArrayList<Integer> list){
        System.out.println();
        System.out.println("Sum of elements — " + new FunctionOfList().sumElementsOfList(list));
    }
    public void showList(ArrayList<Integer> list){
        System.out.println("All numbers of text: ");
        new FunctionOfList().showArrayList(list);
    }
}
