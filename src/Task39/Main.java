package Task39;

public class Main {
    public static void main(String[] args) {
        List listOfMarks = new List();
        listOfMarks.fillList(new Input().input());
        listOfMarks.showArrayList("");
        listOfMarks.removeBadMarks();
        listOfMarks.showArrayList(" after remove");
    }
}
