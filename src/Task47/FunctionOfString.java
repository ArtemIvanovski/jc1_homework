package Task47;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionOfString {
    public int countOfWords(String str){
        int count = 0;
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            count++;
        }
        return count;
    }
    public int countOfMarks(String str){
        int count = 0;
        Pattern pattern = Pattern.compile(".*?[,-.:;-?!]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
