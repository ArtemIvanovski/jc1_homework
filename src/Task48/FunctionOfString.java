package Task48;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionOfString extends Task47.FunctionOfString {
    public ArrayList<Integer> StringInToInteger(String str){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        int start = 0;
        while (matcher.find(start)) {
            String value = str.substring(matcher.start(), matcher.end());
            arrayList.add(Integer.parseInt(value));
            start = matcher.end();
        }
        return arrayList;
    }
}
