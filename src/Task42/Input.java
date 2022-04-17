package Task42;

import Task27.FunctionString;

public class Input {
    public String Input() {
        String str;
        while (true) {
            str = new FunctionString().input();
            if (!new FunctionString().isEmpty(str))
                break;
        }
        return str;
    }
}
