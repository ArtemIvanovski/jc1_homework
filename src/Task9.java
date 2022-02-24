import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input day");
        int days = in.nextInt();
        System.out.println("Input month");
        int month = in.nextInt();
        System.out.println("Input year");
        int year = in.nextInt();
        if ((days<30 && month!=2) || (month==2 && days<28))
        {
            days++;
            System.out.println("Next day is "+days+"."+month+"."+year);
            return;
        }
        if (month == 2 && days == 28)
        {
            month++;
            days=1;
            System.out.println("Next day is "+days+"."+month+"."+year);
            return;
        }
        if (month==12 && days==31)
        {
            year++;
            days=1;
            month=1;
            System.out.println("Next day is "+days+"."+month+"."+year);
            return;
        }
        switch (month){
            case 1,3,5,7,8,10:
                if (days == 30)
                {
                    days++;
                    System.out.println("Next day is "+days+"."+month+"."+year);
                    return;
                }
                month++;
                days=1;
                System.out.println("Next day is "+days+"."+month+"."+year);
                break;
            case 4,6,9,11:
                if (days == 29)
                {
                    days++;
                    System.out.println("Next day is "+days+"."+month+"."+year);
                    return;
                }
                month++;
                days=1;
                System.out.println("Next day is "+days+"."+month+"."+year);
                break;
        }
    }
}
