package Task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        FunctionOfArray functionOfArray = new FunctionOfArray();
        for (int i=0;i< array.length;i++)
            array[i]=scanner.nextInt();
        output(array);
        functionOfArray.reverseArray(array);
        output(array);

    }
    public static void output(int[] array){
        System.out.println("Array of numbers: ");
        for (int element: array)
            System.out.print(element+" ");
    }

}
