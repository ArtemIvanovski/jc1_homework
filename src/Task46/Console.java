package Task46;


import java.util.ArrayList;

public class Console {
    public String input(){
        System.out.println("Input path: ");
        return new Input().Input();
    }
    public void showList(ArrayList<String> list, String symbol){
        for (String string:list) {
            System.out.println(symbol+string);
        }
    }
    public void showFoldersList(ArrayList<String> list){
        if(!list.isEmpty()) {
            System.out.println("Folders: ");
            showList(list, "\uD83D\uDCC2");
        }
    }
    public void showFilesList(ArrayList<String> list){
        if (!list.isEmpty()) {
            System.out.println("Files: ");
            showList(list, "\uD83D\uDDCE");
        }
    }
    public void showError(){
        System.out.println("Error path. Check path");
    }
}
