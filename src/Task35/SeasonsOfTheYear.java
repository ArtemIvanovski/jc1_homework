package Task35;

public enum SeasonsOfTheYear {
    WINTER("Морозная, лютая, снежная, новогодняя",90),
    SUMMER("Жаркое, солнечное, купальное, веселое", 92),
    SPRING("Ранняя, дождливая,цветущая",92),
    AUTUMN("Пасмурная, хмурая, желтая, дождливая",91);
    
    private final String description;
    private final int countOfDays;

    SeasonsOfTheYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
    
    public static void showSeasons(){
        System.out.println("Сезоны года:");
        for (SeasonsOfTheYear soty:SeasonsOfTheYear.values()) {
            System.out.println(soty + ". Описание: " + soty.getDescription() + ". Количесвто днея в сезоне: " + soty.getCountOfDays());
        }
    }
}
