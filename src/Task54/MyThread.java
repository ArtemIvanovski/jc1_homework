package Task54;

import Task46.Console;
import Task50.FunctionOfFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyThread implements Runnable {
    final private String nameOfThread;
    final private ArrayList<Integer> arrayList;
    final private String nameOfFile;
    final private ArrayList<String> strings = new ArrayList<>();


    public MyThread(String nameOfThread, ArrayList<Integer> arrayList, String nameOfFile) {
        this.nameOfThread = nameOfThread;
        this.arrayList = arrayList;
        Thread thread = new Thread(this, nameOfThread);
        this.nameOfFile = nameOfFile;
        thread.start();
    }

    @Override
    public void run() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nameOfFile, true));
            String str = "";
            for (Integer element : arrayList) {
                str += element + " ";
            }
            str += nameOfThread + "\n";
            System.out.println(str);
            writer.write(str);
            writer.close();
        } catch (IOException e) {
            new Console().showError();
        }

    }


}
