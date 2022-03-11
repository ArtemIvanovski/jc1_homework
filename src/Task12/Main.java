package Task12;

public class Main {

    public static void main(String[] args) {
        for (int i=0;i<=10;i++)
            OutputFactorial(i);
    }

    private static void OutputFactorial(int i){
        FindFac findFac = new FindFac();
        final long result = findFac.FindFac(i);
        System.out.println(i+"! = "+result);
    }

}
