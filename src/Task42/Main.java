package Task42;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new BreakIntoWords().breakIntoWords(new Input().Input());
        Map map = new Map();
        map.createMap(stringArrayList);
        map.showMap();
    }
}
