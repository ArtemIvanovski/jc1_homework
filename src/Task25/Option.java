package Task25;

public class Option {
    private int count20;
    private int count50;
    private int count100;

    public Option(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public int getCount20() {
        return count20;
    }

    public int getCount50() {
        return count50;
    }

    public int getCount100() {
        return count100;
    }
}
