package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Output();
    }
    private static long Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        long InputNumbers = scanner.nextLong();
        return InputNumbers;
    }
    private static void Output(){
        SumOfDigits sumOfDigits = new SumOfDigits();
        final int result = sumOfDigits.SumOfDigits(Input());
        System.out.println("Сумма цифр числа " + result);
    }
}
