package Task15;

public class Main {
    public static void main(String[] args) {
        int counterNumber = 0;
        CheckNumber checkNumber = new CheckNumber();
        for (int i=50;i<70;i++)
            if (checkNumber.CheckNumber(i)+counterNumber == 2){
                System.out.println("Второе простое число от 50 до 70 — "+i);
                break;
            }
        else
            if (checkNumber.CheckNumber(i)==1)
                counterNumber++;
    }

}
