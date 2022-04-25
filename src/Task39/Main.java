package Task39;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List listOfMarks = new List();
        listOfMarks.fillList(new Input().input("Input count of students: "));
        listOfMarks.showArrayList("Marks: ");
        listOfMarks.removeBadMarks();
        listOfMarks.showArrayList("Marks after remove: ");
    }
}
