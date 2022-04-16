package Task36;

import java.util.Locale;
import java.util.Scanner;

public class Input {
    public String inputSeason(){
        System.out.println("Enter the season of the year: ");
        System.out.println("Example of the input — Winter, Summer, Autumn, Spring ");
        return new Scanner(System.in).next().toLowerCase(Locale.ROOT);
    }
}
