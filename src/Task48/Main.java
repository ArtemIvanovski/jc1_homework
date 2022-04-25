package Task48;

import Task46.Input;
import Task47.ReadFile;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String path = new Console().showInput();
        ReadFile readFile = new ReadFile(path);
        readFile.converter();
        ArrayList<Integer> list;
        list = new FunctionOfString().StringInToInteger(readFile.getText());
        new Console().showList(list);
        new Console().showSum(list);
        list = new FunctionOfList().removeRepeatNumbers(list);
        new Console().showList(list);
    }
}
//D:\work\src\Task48\text
