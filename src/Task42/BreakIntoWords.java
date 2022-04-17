package Task42;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BreakIntoWords {


    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> breakIntoWords(String str){
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            list.add(matcher.group());
        }
        return list;
    }

}
