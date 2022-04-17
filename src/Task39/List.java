package Task39;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class List {

    private Iterator<Integer> iterator;
    private ArrayList<Integer> list;

    public List() {
        this.list = new ArrayList<>();
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void fillList(int count){
        for (int i = 0; i < count; i++){
            int randomValue = new Random().nextInt(6)+1;
            list.add(randomValue);
        }
    }

    public void showArrayList(String str){
        System.out.println("Marks" + str + ":");
        for (Integer element: list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public void removeBadMarks(){
        iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() < 4)
                iterator.remove();
        }
        if (list.isEmpty()){
            System.out.println("All marks are bad");
            System.exit(0);
        }
    }

}
