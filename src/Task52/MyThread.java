package Task52;

import Task48.FunctionOfList;

import java.util.ArrayList;

public class MyThread implements Runnable {
    private Thread thread;
    private ArrayList<Integer> arrayList;
    private double mean;
    private String nameOfThread;

    public MyThread(ArrayList<Integer> arrayList, String nameOfThread) {
        thread = new Thread(this, nameOfThread);
        this.arrayList = arrayList;
        this.mean = (double) new FunctionOfList().sumElementsOfList(arrayList) / arrayList.size();
        this.nameOfThread = nameOfThread;
        thread.start();
    }

    @Override
    public void run() {
        new Console().showResult(mean, nameOfThread);
    }
}
