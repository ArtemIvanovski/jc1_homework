public class Task33 {
    public static void main(String[] args) {
        PlasticCard plasticCard = new PlasticCard("Belinvestbank","6711 7700 1087 3037",
                "Maestro","463","1802","ARTEMIVANOUSKI");
        plasticCard.getInfoCard();
    }
}
class BankCard{
    private String nameOfBank;

    public BankCard(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }
}
class DebitCard extends BankCard{
    private String idNumber;
    private String typeCard;
    private String codCvC;

    public DebitCard(String nameOfBank, String idNumber, String typeCard, String codCvC) {
        super(nameOfBank);
        this.idNumber = idNumber;
        this.typeCard = typeCard;
        this.codCvC = codCvC;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTypeCard() {
        return typeCard;
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    public String getCodCvC() {
        return codCvC;
    }

    public void setCodCvC(String codCvC) {
        this.codCvC = codCvC;
    }
}
class PlasticCard extends  DebitCard{
    private String pinCode;
    private String nameOwner;

    public PlasticCard(String nameOfBank, String idNumber, String typeCard, String codCvC, String pinCode, String nameOwner) {
        super(nameOfBank, idNumber, typeCard, codCvC);
        this.pinCode = pinCode;
        this.nameOwner = nameOwner;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }
    public void getInfoCard(){
        System.out.println("Bank: "+getNameOfBank());
        System.out.println("Id number: "+getIdNumber());
        System.out.println("Type card: "+getTypeCard());
        System.out.println("Code cvc: "+getCodCvC());
        System.out.println("Name of owner: "+getNameOwner());
        System.out.println("Pin code: "+getPinCode());

    }
}