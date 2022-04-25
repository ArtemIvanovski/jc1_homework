package Task47;

public class Main {
    public static void main(String[] args) {
        String path = new Console().showInput();
        ReadFile readFile = new ReadFile(path);
        readFile.converter();
        String text = readFile.getText();
        new Console().showCountOfMark(text);
        new Console().showCountOfWords(text);
    }
}
//D:\work\src\Task47\text
