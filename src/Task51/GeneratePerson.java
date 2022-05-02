package Task51;

import java.util.ArrayList;

public class GeneratePerson {
    ArrayList<Person> listOfPerson = new ArrayList<>();
    ArrayList<String> informationListOfPerson = new ArrayList<>();

    private void generatePerson(int valueOfPerson) {
        Randomizer randomizer = new Randomizer();
        for (int i = 0; i < valueOfPerson; i++) {
            Person person = new Person(randomizer.getName(), randomizer.getSurname(), new RandomNumber().randomNumber(50, 16));
            listOfPerson.add(person);
        }
    }


    public ArrayList<String> getInformationListOfPerson(int valueOfPerson) {
        generatePerson(valueOfPerson);
        for (int i = 0; i < valueOfPerson; i++) {
            System.out.println(listOfPerson.get(i).toString());
            informationListOfPerson.add(listOfPerson.get(i).toString());
        }
        return informationListOfPerson;
    }
}
