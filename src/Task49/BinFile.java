package Task49;

import java.io.*;
import java.util.ArrayList;

public class BinFile {
    private String nameOfFile;

    public BinFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }

    public void writeInFile(ArrayList<Integer> list){
        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(nameOfFile));
            for (Integer element:list) {
                outputStream.write(element);
            }
        } catch (IOException exception) {
            new Console().showError();
        }
    }

    public ArrayList<Integer> readFromFile(){
        ArrayList<Integer> list = new ArrayList<>();
        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream(nameOfFile));
            while (inputStream.available() > 0){
                list.add(inputStream.read());
            }
        } catch (IOException e) {
            new Console().showError();
        }
        return list;
    }


}
