package Task50;

import Task46.FindFilesFolders;
import Task48.FunctionOfList;

import java.io.File;
import java.util.ArrayList;

public class FunctionOfFolder {
    private int valueOfFolder;
    private int valueOfFile;
    private int valueOfNumber;
    private String nameOfMainFolder = "Main Folder";
    private String nameOfFile = "File With Number";
    private String nameOfNameOfFiles = "File With Name Of All Files";
    private String nameOfInformationFromFiles = "File With All Numbers";
    private ArrayList<String> listOfPath;

    public FunctionOfFolder(int valueOfFolder, int valueOfFile, int valueOfNumber) {
        this.valueOfFolder = valueOfFolder;
        this.valueOfFile = valueOfFile;
        this.valueOfNumber = valueOfNumber;
    }


    public void createStructureOfFilesAndFolders() {
        String mainPath = createFolders(nameOfMainFolder, valueOfFolder);
        listOfPath = createFiles(nameOfFile, valueOfFile, mainPath);
        for (String path: listOfPath) {
            new FunctionOfFile().writeInFile(path,new FunctionOfList().fillList(valueOfNumber), " ");
        }
        ArrayList<String> listOfNumber = new FunctionOfFile().readFromFile(listOfPath);
        listOfPath.add(new FunctionOfFile().createNewFile(mainPath,nameOfInformationFromFiles));
        new FunctionOfFile().writeInFile(listOfPath.get(valueOfFile),listOfNumber,"\n");
        listOfPath.add(new FunctionOfFile().createNewFile(mainPath,nameOfNameOfFiles));
        FindFilesFolders findFilesFolders = new FindFilesFolders(mainPath);
        findFilesFolders.divideFilesFolders();
        new FunctionOfFile().writeInFile(listOfPath.get(valueOfFile + 1),findFilesFolders.getFiles(),"\n");

    }

    private ArrayList<String> createFiles(String nameOfFile, int valueOfFile, String path) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < valueOfFile; i++) {
            list.add(new FunctionOfFile().createNewFile(path, nameOfFile + (i + 1)));
        }
        return list;
    }

    private String createFolders(String nameOfMainFolder, int valueOfFolder) {
        String path = nameOfMainFolder + "/";

        File file1 = new File(path);
        file1.mkdir();

        for (int i = 0; i < valueOfFolder - 1; i++) {
            path += "Inner folder" + (i + 1) + "/";
            File file = new File(path);
            file.mkdir();
        }

        return path;
    }


}
