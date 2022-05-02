package Task51;

import java.util.ArrayList;
import java.util.Arrays;

public class Randomizer {
    ArrayList<String> name = new ArrayList<>(Arrays.asList("Владислав", "Павел", "Наталья", "Эдуард", "Артем", "Екатерина", "Маруся",
            " Егор", "Анна", "Абдул", "Павел", "Кристина", "Никита", "Андрей", "Анастасия"));
    ArrayList<String> surname = new ArrayList<>(Arrays.asList("Савич", "Пущеенко", "Романюк", "Палакян", "Павлович", "Мороз", "Мацкевич",
            "Колышкин", "Соколовская", "Каваленка", "Ильинчик", "Волчек", "Аксень", "Моисеенко", "Борисевич"));

    public String getName() {
        return name.get(new RandomNumber().randomNumber(name.size(), 0));
    }

    public String getSurname() {
        return surname.get(new RandomNumber().randomNumber(surname.size(), 0));
    }
}
