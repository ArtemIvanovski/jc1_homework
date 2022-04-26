package Task48;

import Task39.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FunctionOfList{

    public int sumElementsOfList(ArrayList<Integer> list){
        int sum = 0;
        for (Integer elements:list) {
            sum+=elements;
        }
        return sum;
    }

    public void showArrayList(ArrayList<Integer> list){
        for (Integer element: list) {
            System.out.print(element + " ");
        }
    }
    public ArrayList<Integer> removeRepeatNumbers(ArrayList<Integer> list){
        Collections.sort(list);
        int i = 0;
        while (i < list.size() - 1){
            if (list.get(i) == list.get(i + 1)){
                list.remove(i);
            }else
                i++;
        }
        return list;
    }

    public ArrayList<Integer> fillList(int count){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++){
            int randomValue = new Random().nextInt(6)+1;
            list.add(randomValue);
        }
        return list;
    }

    public double findMean(ArrayList<Integer> list, int count){
        double mean = 0;
        try {
            mean = sumElementsOfList(list) / count;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mean;
    }


}
