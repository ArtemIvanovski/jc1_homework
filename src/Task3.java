public class Task3 {
    public static void main(String[] args) {
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1_000_000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
        System.out.println("Byte b = " + b);
        System.out.println("Byte b = " + s);
        System.out.println("Int i = "+ i);
        System.out.println("Long l = " + l);
        System.out.println("Char c = " + c);
        System.out.println("Float f = " + f);
        System.out.println("Double d = " + d);
        System.out.println("Boolean = " + bool);
    }
}
