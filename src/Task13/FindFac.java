package Task13;

import java.math.BigInteger;

public class FindFac {

    public BigInteger FindFac(int number){
        long ans;
        if (number<2)
            return BigInteger.valueOf(1);
        else
            return Fac(number);
    }


    private BigInteger Fac(int num){
        BigInteger ans = BigInteger.valueOf(1);

        do {
            ans = ans.multiply(BigInteger.valueOf(num));
            num-=1;
        }while(num>0);
        return ans;
    }
}
