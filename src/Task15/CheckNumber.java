package Task15;

public class CheckNumber {

    public int CheckNumber(int num){
        if (num < 2)
            return 0;
        for(int i=2;i<Math.sqrt(num);i++)
            if (num % i == 0)
                return 0;
        return 1;
    }
}
