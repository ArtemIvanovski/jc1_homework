package Task53;

import Task48.FunctionOfList;

public class CreateThreads {
    public void createThreads(int valueOfThreads){
        for (int i = 0;i<valueOfThreads;i++){
            new MyThread("Thread №"+(i+1),new FunctionOfList().fillList(10));
        }
    }
}
