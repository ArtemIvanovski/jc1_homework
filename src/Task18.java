import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i=0;i< array.length;i++)
            array[i]=(int) (Math.random()*10);
        System.out.println(array[array.length-1]);
    }
}
