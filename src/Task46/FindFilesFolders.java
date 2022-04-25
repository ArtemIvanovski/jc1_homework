package Task46;

import java.io.File;
import java.util.ArrayList;

public class FindFilesFolders {
    private ArrayList<String> files = new ArrayList<>();
    private ArrayList<String> folders = new ArrayList<>();
    private final String path;

    public FindFilesFolders(String path) {
        this.path = path;
    }

    public void divideFilesFolders(){
        File pathToCatalog = new File(path);
        if (!pathToCatalog.isDirectory()){
            new Console().showError();
            System.exit(1);

        }
        File[] listFiles = pathToCatalog.listFiles();

        for (File file: listFiles) {
            if (file.isFile())
                files.add(file.getName());
            else
                folders.add(file.getName());
        }


    }



    public ArrayList<String> getFiles() {
        return files;
    }

    public ArrayList<String> getFolders() {
        return folders;
    }
}
