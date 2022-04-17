package Task42;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
    private HashMap <String, Integer> hashMap = new HashMap<>();

    public void createMap(ArrayList<String> list){
        for (String elements: list) {
            Integer count = 1;
            while (hashMap.containsKey(elements)){
                count++;
                hashMap.remove(elements);
            }
            hashMap.put(elements, count);
        }
    }
    public void showMap(){
        System.out.println(hashMap);
    }

}
