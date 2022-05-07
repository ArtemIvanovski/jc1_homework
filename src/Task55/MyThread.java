package Task55;

public class MyThread implements Runnable{
    private final String nameOfThread;
    private final long timeForSleep;

    public MyThread(String nameOfThread, long timeForSleep) {
        this.nameOfThread = nameOfThread;
        this.timeForSleep = timeForSleep;
        new Thread(this,nameOfThread)
                .start();
    }

    @Override
    public void run() {
        new Console().showResult(nameOfThread,timeForSleep);
    }

}
