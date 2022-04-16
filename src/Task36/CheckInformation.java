package Task36;

import Task35.SeasonsOfTheYear;

public class CheckInformation {
    public boolean checkInformation(String season){
        if (season.length() == 0 || season == null) {
            System.out.println("Неверный ввод");
            return false;
        }
        return true;
    }

    public SeasonsOfTheYear checkSeason(String season){
        checkInformation(season);
        switch (season){
            case "summer": return SeasonsOfTheYear.SUMMER;
            case "winter": return SeasonsOfTheYear.WINTER;
            case "spring": return SeasonsOfTheYear.SPRING;
            case "autumn": return SeasonsOfTheYear.AUTUMN;
            default:
                System.out.println("Error season");
                System.exit(1);
                return null;
        }
    }
}
