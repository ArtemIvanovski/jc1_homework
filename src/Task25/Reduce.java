package Task25;

public class Reduce {
    final private MoneyStorage moneyStorage;
    public Reduce() {
        this.moneyStorage =new MoneyStorage();
    }

    public void reduceMoney(Option[] options, int optionNumber){
        int  a = moneyStorage.getDenominationOf20()-options[optionNumber].getCount20();
        int  b = moneyStorage.getDenominationOf50()-options[optionNumber].getCount50();
        int  c = moneyStorage.getDenominationOf100()-options[optionNumber].getCount100();
        moneyStorage.setDenominationOf20(a);
        moneyStorage.setDenominationOf50(b);
        moneyStorage.setDenominationOf100(c);
    }
}
