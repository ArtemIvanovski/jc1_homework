package Task25;

public class UserDisplay{
    final private InputCheck inputCheck;
    final private MoneyStorage moneyStorage;

    public UserDisplay() {
        this.inputCheck = new InputCheck();
        this.moneyStorage = new MoneyStorage();
    }

    public void adding() {
        System.out.println("Input the number of banknotes in denominations of 20");
        moneyStorage.setDenominationOf20(inputCheck.inputCheck(""));
        System.out.println("Input the number of banknotes in denominations of 50");
        moneyStorage.setDenominationOf50(inputCheck.inputCheck(""));
        System.out.println("Input the number of banknotes in denominations of 100");
        moneyStorage.setDenominationOf100(inputCheck.inputCheck(""));
    }

    public int inputValue() {
        System.out.println("Enter the amount of money you want to withdraw");
        return inputCheck.inputCheck("");
    }

    public void printNoMoney() {
        System.out.println("The ATM cannot give you such an amount");
    }

    public void printOptions(Option[] options) {
        for (int optionNumber=1;optionNumber<=options.length;optionNumber++){
            int i = optionNumber-1;
            if (options[i]==null) continue;
            System.out.println("[" + optionNumber + "] " + options[i].getCount100()
                    + "*100 + " + options[i].getCount50() + "*50 + " +options[i].getCount20() + "*20");
        }
    }

    public int readOptionNumber() {
        System.out.println("Please select option: ");
        return inputCheck.inputCheck("[1-3]");
    }

    public void printTakeMoney() {
        System.out.println("Take your money!");
    }

    public boolean printContinue() {
        System.out.println();
        System.out.println("Continue? Yes — '1' NO — '0' ");
        if (inputCheck.inputCheck("[0-1]") == 0) return false;
        return true;
    }
}
