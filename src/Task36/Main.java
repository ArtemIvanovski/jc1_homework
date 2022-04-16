package Task36;

import Task35.SeasonsOfTheYear;

public class Main {
    public static void main(String[] args) {
        showNextSeason();
    }
    public static void showNextSeason(){
        SeasonsOfTheYear seasonsOfTheYear = new CheckInformation().checkSeason(new Input().inputSeason());
        System.out.println("Следующий сезон: ");
        if (seasonsOfTheYear.ordinal() == SeasonsOfTheYear.values().length - 1)
            System.out.println(SeasonsOfTheYear.values()[0]);
        else
            System.out.println(SeasonsOfTheYear.values()[seasonsOfTheYear.ordinal() + 1]);
    }
}
