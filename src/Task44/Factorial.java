package Task44;

import Task13.FindFac;

import java.math.BigInteger;

class Factorial extends FindFac {
    @Override
    public BigInteger FindFac(int number) throws MyException {
        if (number < 0) throw new MyException("The number is less than 1");
        return super.FindFac(number);
    }
}
