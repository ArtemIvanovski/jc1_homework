package Task24;

import Task25.InputCheck;

public class Main {

    public static void main(String[] args) {
        Time time1 = input();
        Time time2 = input();
        print(time1);
        print(time2);
        if (time1.equals(time2))
            System.out.println("Обьекты одинаковые");
        else
            System.out.println("Обьекты не одинаковые");
    }
    private static Time input() {
        InputCheck inputCheck = new InputCheck();
        System.out.println("Введите колво секунд");
        int seconds = inputCheck.inputCheck("");
        System.out.println("Введите колво минут");
        int minutes = inputCheck.inputCheck("");
        System.out.println("Введите колво часов");
        int hours = inputCheck.inputCheck("");
        return new Time(seconds,minutes,hours);
    }
    private static void print(Time time){
        System.out.println("Полное количество в обьекте: "+time.getOnlySeconds());
        System.out.println("Количество секунд: "+time.getSeconds());
        System.out.println("Количество минут: "+time.getMinutes());
        System.out.println("Количество часов: "+time.getHours());
    }

}
