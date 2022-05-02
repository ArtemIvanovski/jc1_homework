package Task51;

import Task50.FunctionOfFile;

public class Main {
    public static void main(String[] args) {
        new FunctionOfFile().writeInFile(
                new FunctionOfFile().createNewFile("","Information about persons"),
                new GeneratePerson().getInformationListOfPerson(10),
                "\n");

    }
}
