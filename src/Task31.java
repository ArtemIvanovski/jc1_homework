public class Task31 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        long time1 = buildString() - time;
        time = System.currentTimeMillis();
        long time2 = buildStringBuilder() - time;
        System.out.println("Время работы стринг " + time1);
        System.out.println("Время работы билдера " + time2);
        if (time2 > time1)
            System.out.println("Билдер работает быстрее на "+ (time2 - time1));
        else
            System.out.println("Стринг работате быстрее на "+ (time1-time2));
    }
    public static long buildString(){
        String s = "aaabbbccc";
        for (int i = 0;i<1_000_000;i++)
            s = s + "aaabbbccc";
        return System.currentTimeMillis();
    }
    public static long buildStringBuilder(){
        StringBuilder s = new StringBuilder("aaabbbccc");
        for (int i = 0; i<1_000_000;i++)
            s.append("aaabbbccc");
        return System.currentTimeMillis();
    }
}
