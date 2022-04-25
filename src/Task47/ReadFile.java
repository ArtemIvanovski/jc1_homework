package Task47;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    private String path;
    StringBuilder text = new StringBuilder("");

    public ReadFile(String path) {
        this.path = path;
    }

    public void converter(){
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                text.append(scanner.next());
                text.append(" ");
            }
        } catch (FileNotFoundException e) {
            new Console().showError();
        }
    }

    public String getText() {
        return text.toString();
    }
}
