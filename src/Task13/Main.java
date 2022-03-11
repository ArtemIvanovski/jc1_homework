package Task13;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        for (int i=1;i<=25;i++)
            OutputFactorial(i);
    }

    private static void OutputFactorial(int i){
        FindFac findFac = new FindFac();
        BigInteger result = findFac.FindFac(i);
        System.out.println(i+"! = "+result);
    }

}
