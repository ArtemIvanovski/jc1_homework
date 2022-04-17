package Task41;

import Task39.Input;
import Task39.List;

public class Main {
    public static void main(String[] args) {
        List listOfMarks = new List();
        listOfMarks.fillList(new Input().input("Input count of students: "));
        listOfMarks.showArrayList("Marks: ");
        System.out.println("Max mark is "+ listOfMarks.maxMarks());
    }
}
