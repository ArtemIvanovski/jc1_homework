package Task25;

public class Reduce {
    final private MoneyStorage moneyStorage;
    public Reduce() {
        this.moneyStorage =new MoneyStorage();
    }

    public void reduceMoney(Option[] options, int optionNumber){
        moneyStorage.decreaseDenominationOf20(options[optionNumber].getCount20());
        moneyStorage.decreaseDenominationOf50(options[optionNumber].getCount50());
        moneyStorage.decreaseDenominationOf100(options[optionNumber].getCount100());
    }
}
