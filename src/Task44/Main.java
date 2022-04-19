package Task44;


import Task25.InputCheck;

public class Main {
    public static void main(String[] args) throws MyException {
        Factorial factorial = new Factorial();
        System.out.println("Please enter a number less than 0: ");
        System.out.println(factorial.FindFac(new InputCheck().inputCheck("")));
    }
}
