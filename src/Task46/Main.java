package Task46;

public class Main {
    public static void main(String[] args) {
        String path = new Console().input();
        FindFilesFolders findFilesFolders = new FindFilesFolders(path);
        findFilesFolders.divideFilesFolders();
        new Console().showFilesList(findFilesFolders.getFiles());
        new Console().showFoldersList(findFilesFolders.getFolders());
    }
}
