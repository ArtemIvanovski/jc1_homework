package Task13;

import Task44.MyException;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws MyException {
        for (int i=1;i<=25;i++)
            OutputFactorial(i);
    }

    private static void OutputFactorial(int i) throws MyException {
        FindFac findFac = new FindFac();
        BigInteger result = findFac.FindFac(i);
        System.out.println(i+"! = "+result);
    }

}
