import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of seconds:");
        int sec = in.nextInt();
        int s = sec;
        int weeks = sec / (3600*24*7);
        sec -= weeks * (3600*24*7);
        int days = sec / (3600*24);
        sec -= days * (3600*24);
        int hours = sec / 3600;
        sec -= hours * 3600;
        int minutes = sec / 60;
        sec -= minutes * 60;
        System.out.println(s +" seconds are "+weeks+" weeks "+days+" days "+hours+" hours "+minutes+" minutes "+sec+" seconds");
    }
}
