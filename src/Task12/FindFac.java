package Task12;

public class FindFac {

    public long FindFac(int number){
        long ans;
        if (number<2)
            return 1;
        else
            return Fac(number);
    }


    private long Fac(int num){
        long ans=1;
        while (num>0){
            ans*=num;
            num--;
        }
        return ans;
    }
}
