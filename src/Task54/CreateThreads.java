package Task54;

import Task48.FunctionOfList;
import Task50.FunctionOfFile;

public class CreateThreads {
    public void createThreads(int valueOfThreads) {
        for (int i = 0; i < valueOfThreads; i++) {
            new MyThread("Thread №" + (i + 1), new FunctionOfList().fillList(10), "File of threads.txt");
        }

    }
}
