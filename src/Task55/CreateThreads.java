package Task55;

public class CreateThreads {
    public void createThreads(int valuesOfThreads, long time) {
        for (int i = 0; i < valuesOfThreads; i++) {
            new MyThread("Thread № "+(i+1),time);
        }
    }
}
