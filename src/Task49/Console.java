package Task49;

import Task48.FunctionOfList;

import java.util.ArrayList;

public class Console {
    public void showError(){
        System.out.println("Error read/write in file");
    }
    public void showList(ArrayList<Integer> arrayList){
        new FunctionOfList().showArrayList(arrayList);
    }
    public void showMean(ArrayList<Integer> arrayList,int count){
        System.out.println("Average of numbers — " + new FunctionOfList().findMean(arrayList, count));
    }
}
