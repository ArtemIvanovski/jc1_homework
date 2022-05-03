package Task53;

import Task22.FunctionOfArray;
import Task48.FunctionOfList;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread implements Runnable{
    final private String nameOfThread;
    final private int maxValue;


    public MyThread(String nameOfThread, ArrayList<Integer> arrayList) {
        this.nameOfThread = nameOfThread;
        Collections.sort(arrayList);
        this.maxValue = arrayList.get(arrayList.size() - 1);
        Thread thread = new Thread(this, nameOfThread);
        thread.start();
    }

    @Override
    public void run() {
        new Console().showResult(nameOfThread,maxValue);
    }
}
