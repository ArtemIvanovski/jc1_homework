package Task55;

public class Console {
    public synchronized void showResult(String nameOfThread, long time){
        System.out.println(nameOfThread);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            showError();
        }
    }
    private void showError(){
        System.out.println("Error with thread ");
    }
}
