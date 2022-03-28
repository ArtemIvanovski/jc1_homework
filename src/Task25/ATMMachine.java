package Task25;

public class ATMMachine{
    final private UserDisplay userDisplay;
    final private OptionWithdraw optionWithdraw;
    final private Reduce reduce;
    static int valueOfMoney;
    public ATMMachine() {
        this.userDisplay = new UserDisplay();
        this.reduce = new Reduce();
        this.optionWithdraw = new OptionWithdraw();
    }
    public void AddingMoney(){
        userDisplay.adding();
    }

    public void Work(){
        while (true) {
            valueOfMoney = inputValueOFMoney();
            if (findOptions(valueOfMoney)) {
                showOptions();
                int optionNumber = selectOptions();
                reduceMoney(optionNumber);
                giveMoney();
            } else {
                showNoMoney();
            }
            if (!goContinue()) break;
        }
    }

    private boolean goContinue() {
        return userDisplay.printContinue();
    }


    private int inputValueOFMoney() {
        return userDisplay.inputValue();
    }

    private boolean findOptions(int valueOfMoney) {
        return optionWithdraw.findOption(valueOfMoney);
    }

    private void showOptions() {
        userDisplay.printOptions(optionWithdraw.getOptions());
    }

    private int selectOptions() {
        return userDisplay.readOptionNumber();
    }

    private void reduceMoney(int optionNumber) {
        reduce.reduceMoney(optionWithdraw.getOptions(), optionNumber-1);
    }

    private void giveMoney() {
        userDisplay.printTakeMoney();

    }

    private void showNoMoney() {
        userDisplay.printNoMoney();
    }
}
