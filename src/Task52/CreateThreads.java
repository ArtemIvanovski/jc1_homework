package Task52;

import Task48.FunctionOfList;

public class CreateThreads {
    public void createThreads(int valueOfThreads) {
        for (int i = 0; i < valueOfThreads; i++) {
            new MyThread(new FunctionOfList().fillList(10), "Thread №" + (i + 1));
        }
    }
}
