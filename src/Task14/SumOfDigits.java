package Task14;

public class SumOfDigits {

    public int SumOfDigits(long a){
        if (a==0)
            return 0;
        else
            if (a<0){
                a*=-1;
                return Sum(a);
            }
            else
                return Sum(a);
    }

    private int Sum(long number){
        int sum=0;

        do {
            sum+=number%10;
            number/=10;
        }while (number>0);

        return sum;
    }



}
