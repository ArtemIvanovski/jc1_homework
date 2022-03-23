package Task25;

public class OptionWithdraw {
    private Option[] options;
    final private MoneyStorage moneyStorage;

    public OptionWithdraw() {
        this.moneyStorage = new MoneyStorage();
    }

    public boolean findOption(int valueOfMoney){
        options = new Option[3];
        int count=0;
        boolean flag = false;
        for (int a=moneyStorage.getDenominationOf100();a>=0;a--)
            for (int b=moneyStorage.getDenominationOf50();b>=0;b--)
                for (int c=moneyStorage.getDenominationOf20();c>=0;c--) {
                    if (a * 100 + b * 50 + c * 20 == valueOfMoney) {
                        flag = true;
                        options[count] = new Option(c, b, a);
                        count++;
                    }
                    if (count>=3) return true;
                }
        return flag;
    }

    public Option[] getOptions() {
        return options;
    }
}
