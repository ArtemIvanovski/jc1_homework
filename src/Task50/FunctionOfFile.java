package Task50;

import Task49.Console;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunctionOfFile {

    public String createNewFile(String pathToFile, String nameOfFile) {
        String path = pathToFile + nameOfFile + ".txt";
        try {
            new FileWriter(path);
        } catch (IOException e) {
            new Console().showError();
        }
        return path;
    }

    public <T> void writeInFile(String pathToFile, ArrayList<T> list, String symbol) {
        try {
            FileWriter writer = new FileWriter(pathToFile, false);
            for (T element : list) {
                writer.write(element + symbol);
            }
            writer.close();
        } catch (IOException e) {
            new Console().showError();
        }
    }


    public ArrayList<String> readFromFile(ArrayList<String> path) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (String pathToFile: path) {
                File file = new File(pathToFile);
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    arrayList.add(scanner.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            new Console().showError();
        }
        return arrayList;
    }
}
