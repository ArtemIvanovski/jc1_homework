package Task52;

import Task48.FunctionOfList;

import java.util.ArrayList;

public class MyThread implements Runnable {
    final private double mean;
    final private String nameOfThread;

    public MyThread(ArrayList<Integer> arrayList, String nameOfThread) {
        Thread thread = new Thread(this, nameOfThread);
        this.mean = (double) new FunctionOfList().sumElementsOfList(arrayList) / arrayList.size();
        this.nameOfThread = nameOfThread;
        thread.start();
    }

    @Override
    public void run() {
        new Console().showResult(mean, nameOfThread);
    }
}
