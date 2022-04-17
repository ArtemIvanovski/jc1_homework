package Task40;

import Task39.Input;
import Task39.List;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.fillList(new Input().input("Input count of numbers: "));
        list.showArrayList("List: ");
        list.removeRepeatNumbers();
        list.showArrayList("List after remove repeat numbers: ");
    }
}
