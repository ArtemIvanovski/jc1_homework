package Task49;

import Task39.Input;
import Task48.FunctionOfList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int amountOfNumber = new Input().input("Input amount of number");
        ArrayList<Integer> listOfNumber;
        listOfNumber = new FunctionOfList().fillList(amountOfNumber);
        new BinFile("FilesOfNumber").writeInFile(listOfNumber);
        listOfNumber = new BinFile("FilesOfNumber").readFromFile();
        new Console().showList(listOfNumber);
        new Console().showMean(listOfNumber,amountOfNumber);
    }
}
