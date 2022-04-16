package Task37;

import Task35.SeasonsOfTheYear;
import Task36.CheckInformation;
import Task36.Input;

public class Main {
    public static void main(String[] args) {
        showCountOfDays();
    }

    public static void showCountOfDays(){
        SeasonsOfTheYear seasonsOfTheYear = new CheckInformation().checkSeason(new Input().inputSeason());
        System.out.println("Count of "+ seasonsOfTheYear + " — " + seasonsOfTheYear.getCountOfDays());
    }
}
